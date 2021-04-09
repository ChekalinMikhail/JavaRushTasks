package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> repeats = new HashMap<>();

        try (FileInputStream fileInput = new FileInputStream(scanner.nextLine())) {
            while (fileInput.available() > 0)
                list.add(fileInput.read());
        }

        for (Integer i : list)
            repeats.put(i, Collections.frequency(list, i));

        int maxFrequency = Collections.max(repeats.values());

        for (Map.Entry<Integer, Integer> pair : repeats.entrySet()){
            if (pair.getValue() == maxFrequency)
                System.out.print(pair.getKey());
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt