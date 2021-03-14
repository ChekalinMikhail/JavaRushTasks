package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add(0, "Котя");
        list.add(1, "любит");
        list.add(2, "Котю");
        list.add(3, "очень");
        list.add(4, "сильно");

        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));



        //напишите тут ваш код
    }
}
