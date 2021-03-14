package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String URL = scanner.nextLine();
        String URLcut = URL.substring(URL.lastIndexOf("?") + 1);

        String [] strings = URLcut.split("&");

        ArrayList<String> list = new ArrayList<>();

        for (String s : strings) {
            String [] strings1 = s.split("=", 2);
            System.out.print(strings1[0] + " ");

            if (strings1[0].equals("obj"))
                list.add(strings1[1]);

        }

        System.out.println();

        for (String s : list) {
            try {
                Double value = Double.parseDouble(s);
                alert(value);
            } catch (NumberFormatException e) {
                alert(s);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
