package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String tag = args[0];
        //String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName = "C:\\Users\\Acer\\Desktop\\STONKS.txt";
        String readLine;
        int internalTagsCount;
        String line = "";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while ((readLine = fileReader.readLine()) != null) {
                line = line + readLine;
            }
        }
        System.out.println(line);

        List<String> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();

        Pattern pattern = Pattern.compile("<span");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            start.add(line.substring(matcher.start(), matcher.end()));
        }
        start.forEach(System.out::println);
    }
}
//C:\Users\Acer\Desktop\STONKS.txt