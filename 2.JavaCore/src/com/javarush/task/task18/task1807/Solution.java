package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int commaCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine())) {
            while (fileInputStream.available() > 0) {
                if (fileInputStream.read() == 44)
                    commaCount++;
            }
        }
        System.out.println(commaCount);
    }
}
