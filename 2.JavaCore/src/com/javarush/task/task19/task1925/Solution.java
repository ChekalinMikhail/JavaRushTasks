package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String line;
        List<String> list = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {
            while ((line = fileReader.readLine()) != null) {
                String[] split = line.split(" ");
                for (String s : split) {
                    if (s.length() > 6)
                        list.add(s);
                }
            }
            if (!list.isEmpty())
                fileWriter.write(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                fileWriter.write("," + list.get(i));
            }
        }
    }
}
