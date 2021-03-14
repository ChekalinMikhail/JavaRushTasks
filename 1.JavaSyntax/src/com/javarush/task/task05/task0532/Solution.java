package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int i = 1;

        if (N <= 0) {}
        else {
            int max = Integer.parseInt(reader.readLine());
            while (i < N) {
                int number = Integer.parseInt(reader.readLine());
                max = Math.max(max, number);
                i++;
                }
            System.out.println(max);
        }
    }
}
