package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
