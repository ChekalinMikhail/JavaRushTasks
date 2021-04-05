package com.javarush.task.task17.task1702;

import java.util.ArrayList;
import java.util.List;

/* 
Вместе быстрее? Ща проверим :)
*/

public class Solution {
    public static int threadCount = 20;
    public static int[] testArray = new int[100];

    static {
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
    }

    public static class SortThread extends Thread {
        public void run() {
            try {
                sort(testArray);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        StringBuffer expectedResult = new StringBuffer();
//        for (int i = 1000 - 1; i >= 0; i--) {
//            expectedResult.append(i).append(" ");
//        }

        for (int s : testArray) {
            System.out.print(s + " ");
        }

        System.out.println();

        long time = System.currentTimeMillis();

        initThreads();

        for (int s : testArray) {
            System.out.print(s + " ");
        }

        System.out.println();

        System.out.println(System.currentTimeMillis() - time);

//        StringBuffer result = new StringBuffer();
//        for (int i = 0; i < testArray.length; i++) {
//            result.append(testArray[i]).append(" ");
//        }
//        System.out.println(result);
//        System.out.println((result.toString()).equals(expectedResult.toString()));
    }

    public static void initThreads() throws InterruptedException {
        List<Thread> threads = new ArrayList<Thread>(threadCount);
        for (int i = 0; i < threadCount; i++) threads.add(new SortThread());
        for (Thread thread : threads) thread.start();
        for (Thread thread : threads) thread.join();
    }

    public static void sort(int[] array) throws InterruptedException {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    synchronized (Solution.testArray) {
                        int k = array[i];
                        array[i] = array[j];
                        array[j] = k;
                    }
                    Thread.sleep(1);
                }
            }
        }
    }
}

