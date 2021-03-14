package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException();

        while (a != b) {
            if (a > b)
                a -= b;
            if (b > a)
                b -= a;
        }

        System.out.println(a);
    }
}
