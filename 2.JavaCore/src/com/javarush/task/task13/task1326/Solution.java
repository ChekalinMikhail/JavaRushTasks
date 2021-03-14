package com.javarush.task.task13.task1326;

import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

//        FileInputStream inputFile = new FileInputStream(fileName);
//        BufferedInputStream inputBuffer = new BufferedInputStream(inputFile);
//        Scanner scanner = new Scanner(inputBuffer);
//        Всё это можно записать в одну строчку

        Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(fileName)));

        ArrayList<Integer> list = new ArrayList<>();

        while(scanner.hasNext())
            list.add(scanner.nextInt());

        Collections.sort(list);

        for (Integer i : list) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        scanner.close();

    }
}
//C:\Users\Acer\Desktop\STONKS.txt