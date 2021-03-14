package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> [] arrayOfStringList = new ArrayList[2];
        arrayOfStringList[0] = new ArrayList<>();
        arrayOfStringList[0].add("мама");
        arrayOfStringList[1] = new ArrayList<>();
        arrayOfStringList[1].add("мыла");


        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}