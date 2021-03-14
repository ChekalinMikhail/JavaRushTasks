package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while (!line.equals("exit")) {
            if (line.contains(".")) {
                try {
                    Double numberDouble = Double.parseDouble(line);
                    print(numberDouble);
                } catch (NumberFormatException e) {
                    print(line);
                }
            } else {
                try {
                    Integer numberInt = Integer.parseInt(line);
                    if (numberInt > 0 && numberInt < 128) {
                        Short numberShort = Short.parseShort(line);
                        print(numberShort);
                    } else {
                        print(numberInt);
                    }
                } catch (NumberFormatException e) {
                    print(line);
                }
            }

            line = scanner.nextLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
