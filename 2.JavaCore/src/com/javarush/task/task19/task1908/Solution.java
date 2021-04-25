package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listIn = new ArrayList<>();
        ArrayList<String> listOut = new ArrayList<>();

        String fileName1;
        String fileName2;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            while (fileReader.ready()) {
                String str = fileReader.readLine();
                String[] split = str.split(" ");
                for (String s : split)
                    listIn.add(s);
            }
        }

        for (String s : listIn) {
            try {
                listOut.add(String.valueOf(Integer.parseInt(s)));
            } catch (Exception e) {
            }
        }

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            for (String s : listOut)
                fileWriter.write(s + " ");
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt