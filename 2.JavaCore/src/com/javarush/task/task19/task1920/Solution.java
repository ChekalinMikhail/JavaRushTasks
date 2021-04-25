package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> salary = new TreeMap<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String[] data = fileReader.readLine().split(" ");
                String name = data[0];
                double value = Double.parseDouble(data[1]);
                if (salary.containsKey(name)) {
                    value += salary.get(name);
                    salary.put(name, value);
                } else {
                    salary.put(name, value);
                }
            }
        }

        double maxSalary = 0;
        for (Double d : salary.values()) {
            if (d > maxSalary)
                maxSalary = d;
        }

        for (Map.Entry<String, Double> map : salary.entrySet()) {
            if (map.getValue() == maxSalary)
                System.out.println(map.getKey());
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt