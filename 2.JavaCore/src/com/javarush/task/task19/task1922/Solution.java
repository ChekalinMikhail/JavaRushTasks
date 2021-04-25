package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        String line;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while ((line = fileReader.readLine()) != null) {
                int counter = 0;
                String[] split = line.split(" ");
                for (int i = 0; i < split.length; i++) {
                    for (int j = 0; j < words.size(); j++) {
                        if (split[i].equals(words.get(j)))
                            counter++;
                    }
                }
                if (counter == 2)
                    System.out.println(line);
                counter = 0;
            }
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt