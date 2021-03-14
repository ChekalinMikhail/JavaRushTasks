package com.javarush.task.task11.task1101;

/* 
Лошадь и Пегас
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите массив строк, для окончания введите пустую строку");

        String line = reader.readLine();

        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        System.out.println("Ввод окончен");

        try {
            while (true) {
                System.out.println(list.get(0));
                list.remove(0);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Вывод закончен");
        }

    }
}
