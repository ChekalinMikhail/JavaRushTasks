package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String line;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {
            while ((line = fileReader.readLine()) != null) {
                String[] split = line.split(" ");
                boolean haveDigit = false;
                for (String s : split) {
                    char[] chars = s.toCharArray();
                    for (char c : chars) {
                        if (Character.isDigit(c)) {
                            haveDigit = true;
                            break;
                        }
                    }
                    if (haveDigit) {
                        fileWriter.write(s + " ");
                        haveDigit = false;
                    }
                }
            }
        }
    }
}
