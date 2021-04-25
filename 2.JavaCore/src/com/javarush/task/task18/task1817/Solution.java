package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        double countOfSpace = 0;
        double countOfSimbol = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char readChar = (char) fileReader.read();
                countOfSimbol++;
                if (Character.isWhitespace(readChar))
                    countOfSpace++;
                System.out.print(readChar);
            }
            System.out.println();
        }
        if (countOfSimbol != 0) {
            double ratioOfSpace = countOfSpace / countOfSimbol * 100;
            System.out.printf("%.2f", ratioOfSpace);
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt