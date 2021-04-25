package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //String path = "C:\\Users\\Acer\\Desktop\\Lion\\";
        List<String> fileNames = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            while (!line.equals("end")) {
                fileNames.add(line);
                line = reader.readLine();
            }
        }

        Collections.sort(fileNames, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] line1 = o1.split(".part");
                String[] line2 = o2.split(".part");
                return Integer.parseInt(line1[1]) - Integer.parseInt(line2[1]);
            }
        });

        String fileName = fileNames.get(0).substring(0, fileNames.get(0).lastIndexOf("."));

        for (String s : fileNames) {
            try (FileInputStream input = new FileInputStream(s); FileOutputStream output = new FileOutputStream(fileName, true)) {
                byte[] buffer = new byte[input.available()];
                while (input.available() > 0) {
                    int bytes = input.read(buffer);
                    output.write(buffer, 0 , bytes);
                }
            }
        }
    }
}
