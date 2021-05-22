package com.javarush.task.task20.task2025;


/* 
Алгоритмы-числа
*/

import java.util.*;

public class Solution {
    public static long[][] matrix = new long[10][19];
    public static long[] grade = new long[19];
    public static TreeSet<Long> set;
    public static int[] number = new int[19];

    static {
        grade[0] = 1;
        for (int i = 1; i < 19; i++) {
            grade[i] = grade[i - 1] * 10;
        }
    }

    static {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                long n = i;
                for (int k = 0; k < j; k++) {
                    n = n * i;
                }
                matrix[i][j] = n;
            }
        }
    }

    public static void nextNumber() {
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] == 9) {
                continue;
            }
            if (number[i] < 9) {
                number[i]++;

                for (int j = i + 1; j < number.length; j++) {
                    number[j] = number[i];
                }
                break;
            }
        }
    }

    public static TreeSet<Long> findAndCheckSums(long maxNumber, long currentNumber) {
        TreeSet<Long> set = new TreeSet<>();
        long sum = 0;
        int degree = (int) (Math.log10(currentNumber));
        for (int j = degree; j < number.length; j++) {
            sum = 0;
            for (int i = 0; i < number.length; i++) {
                sum += matrix[number[i]][j];
                if (sum >= maxNumber || sum < 0)
                    return set;
            }
            if (checkSum(sum))
                set.add(sum);
        }
        return set;
    }

    public static boolean checkSum(long n) {
        long sumForChecking = n;
        long currentSum = 0;
        int[] sumForCheckingToArray = numberToArray(sumForChecking);
        int degree = (int) (Math.log10(sumForChecking) + 1);
        for (int i = 0; i < sumForCheckingToArray.length; i++) {
            currentSum += matrix[sumForCheckingToArray[i]][degree - 1];
        }
        if (currentSum == sumForChecking) {
            return true;
        } else
            return false;
    }

    public static long arrayToNumber(int[] n) {
        long result = 0;
        int degree = 18;
        for (int i = 0; i < n.length; i++) {
            result += n[i] * grade[degree];
            degree--;
        }
        return result;
    }

    public static int[] numberToArray(long n) {
        int[] array = new int[19];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = (int) (n % 10);
            n /= 10;
        }
        return array;
    }

    public static long[] getNumbers(long N) {
        number = new int[19];
        set = new TreeSet<>();
        long currentNumber;
        while (true) {
            nextNumber();
            if(number[0] == 9)
                break;
            currentNumber = arrayToNumber(number);
            set.addAll(findAndCheckSums(N, currentNumber));
            if (currentNumber >= N)
                break;
        }
        long[] result = new long[set.size()];
        int index = 0;
        for (Long l : set) {
            result[index] = l;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 5000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
