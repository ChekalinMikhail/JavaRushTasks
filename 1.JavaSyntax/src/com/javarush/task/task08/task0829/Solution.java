package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> familys = new ArrayList<>();
        List<String> citys = new ArrayList<>();

        while (true) {
            String city = reader.readLine();

            if (city.isEmpty()) {
                break;
            }

            citys.add(city);

            String family = reader.readLine();

            if (family.isEmpty()) {
                break;
            }

            familys.add(family);
        }

        String  city1 = reader.readLine();

        if (!city1.isEmpty()) {
            System.out.println(familys.get(citys.indexOf(city1)));
        }
    }
}
