package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInput = new FileInputStream(scanner.nextLine());
        int min = fileInput.read();

        while (fileInput.available() > 0) {
            int data = fileInput.read();
            if (data < min)
                min = data;
        }

        fileInput.close();
        System.out.println(min);
    }
}

//C:\Users\Acer\Desktop\STONKS.txt
