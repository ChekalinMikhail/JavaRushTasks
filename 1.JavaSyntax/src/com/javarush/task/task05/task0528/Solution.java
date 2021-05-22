package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
//        Date date = new Date();
//        System.out.println(sdf.format(date));
        Integer x = Integer.MAX_VALUE;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        Long y = Long.MAX_VALUE;
        System.out.println(y);
        System.out.println(Long.toBinaryString(y));
        System.out.println(y >> 32);
        System.out.println(Long.toBinaryString(y >> 32));
//        System.out.println(Integer.toBinaryString(x << 3));
//        System.out.println(Integer.toBinaryString(x >>> 3));
    }
}
