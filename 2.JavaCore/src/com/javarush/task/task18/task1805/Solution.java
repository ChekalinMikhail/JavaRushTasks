package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> list = new TreeSet<>();
        try (FileInputStream file = new FileInputStream(new Scanner(System.in).nextLine())) {
            while (file.available() > 0)
                list.add(file.read());
        }
        for (Integer i : list)
            System.out.print(i + " ");
    }
}
//C:\Users\Acer\Desktop\STONKS.txt