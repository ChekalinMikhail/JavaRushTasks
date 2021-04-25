package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        byte[] bytes = new byte[fileInputStream1.available()];
        fileInputStream1.read(bytes);
        fileInputStream1.close();
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);

        while (fileInputStream2.available() > 0)
            fileOutputStream1.write(fileInputStream2.read());

        for (byte value : bytes) {
            fileOutputStream1.write(value);
        }
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}
//C:\Users\Acer\Desktop\STONKS.txt