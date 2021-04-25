package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] chars = new int[128];
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                chars[fileReader.read()]++;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0)
                System.out.println(String.format("%s %d", (char) i, chars[i]));
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt