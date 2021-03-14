package com.javarush.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вызовов get
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        Date date = new Date();
        long time1 = date.getTime();

        get10000(list);

        Date date1 = new Date();
        long time2 = date1.getTime();

        return time2 - time1;
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
