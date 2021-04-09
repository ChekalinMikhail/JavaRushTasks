package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInput = new FileInputStream(scanner.nextLine());
        int max = 0;

        while (fileInput.available() > 0) {
            int data = fileInput.read();
            if (data > max)
                max = data;
        }

        fileInput.close();
        System.out.println(max);
    }
}

//C:\Users\Acer\Desktop\STONKS.txt
