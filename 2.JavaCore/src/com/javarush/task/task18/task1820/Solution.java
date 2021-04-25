package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            while (fileReader.ready()) {
                String str = fileReader.readLine();
                String[] split = str.split(" ");
                for (String s : split) {
                    int d = (int)Math.round(Double.parseDouble(s));
                    fileWriter.write(d + " ");
                }
            }
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt