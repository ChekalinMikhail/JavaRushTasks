package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1name = reader.readLine();
        String file2name = reader.readLine();
        String file3name = reader.readLine();
        try (FileInputStream file1 = new FileInputStream(file1name);
             FileOutputStream file2 = new FileOutputStream(file2name);
             FileOutputStream file3 = new FileOutputStream(file3name)) {
            int byteCount = file1.available();
            if (byteCount % 2 == 0)
                byteCount /= 2;
            else byteCount = byteCount / 2 + 2;
            while (file1.available() >= byteCount)
                file2.write(file1.read());
            while (file1.available() > 0)
                file3.write(file1.read());
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt