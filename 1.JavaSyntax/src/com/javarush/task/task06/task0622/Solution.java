package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }

        Collections.sort(list);

        //list.forEach(System.out::println); //либо так

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //либо так
    }
}
