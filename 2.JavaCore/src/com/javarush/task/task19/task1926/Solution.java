package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        String line;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while ((line = fileReader.readLine()) != null) {
                StringBuilder reversLine = new StringBuilder(line).reverse();
                System.out.println(reversLine.toString());
            }
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt