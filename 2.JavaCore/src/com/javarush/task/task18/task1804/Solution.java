package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInput = new FileInputStream(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> repeats = new HashMap<>();

        while (fileInput.available() > 0)
            list.add(fileInput.read());
        fileInput.close();

        for (Integer i : list)
            repeats.put(i, Collections.frequency(list, i));

        int minrepeats = Collections.min(repeats.values());

        for (Map.Entry<Integer, Integer> pair : repeats.entrySet()) {
            if (pair.getValue() == minrepeats)
                System.out.print(pair.getKey() + " ");
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt
