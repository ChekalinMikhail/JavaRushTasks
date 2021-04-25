package com.javarush.task.task19.task1909;

import java.io.*;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1)); BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            while (fileReader.ready()) {
                String str = fileReader.readLine().replaceAll("\\.", "\\!");
                fileWriter.write(str + "\n");
            }
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt