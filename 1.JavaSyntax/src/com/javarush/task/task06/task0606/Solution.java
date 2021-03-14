package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 0) {
            if ((number % 2) == 0)
                even++;
            else
                odd++;
            number /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);

        //напишите тут ваш код
    }
}
