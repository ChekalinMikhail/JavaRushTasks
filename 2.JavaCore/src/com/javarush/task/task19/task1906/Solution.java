package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
             FileWriter writer = new FileWriter(reader.readLine())) {

            while (fileReader.ready())
                list.add(fileReader.read());

            for (int i = 1; i < list.size(); i += 2) {
                writer.write(list.get(i));
            }
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt