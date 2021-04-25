package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int worldCount = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine())) {

            StringBuilder string = new StringBuilder("");
            while (fileReader.ready()) {
                char c = (char)fileReader.read();
                if (Character.isLetter(c)) {
                    string.append(c);
                } else {
                    if (string.toString().equals("world"))
                        worldCount++;
                    string = new StringBuilder("");
                }
            }
        }
        System.out.println(worldCount);
    }
}
