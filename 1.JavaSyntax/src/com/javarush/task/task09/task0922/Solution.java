package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        String s = reader.readLine();

        Date date = formatter.parse(s);

        formatter.applyPattern("MMM dd, yyyy");

        String date1 = formatter.format(date);

        System.out.println(date1.toUpperCase());
    }
}
