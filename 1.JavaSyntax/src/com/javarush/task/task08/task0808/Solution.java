package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        Date date = new Date();
        long time1 = date.getTime();

        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        Date date1 = new Date();
        long time2 = date1.getTime();

        long time = time2 - time1;

        System.out.println("вставка или add заняла времени = " + time);

    }

    public static void get10000(List list) {
        Date date = new Date();
        long time1 = date.getTime();

        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }

        Date date1 = new Date();
        long time2 = date1.getTime();

        long time = time2 - time1;

        System.out.println("получение или get заняло столько времени = " + time);

    }

    public static void set10000(List list) {
        Date date = new Date();
        long time1 = date.getTime();

        for (int i = 0; i < 10000; i++) {
            list.set(i, 666);
        }

        Date date1 = new Date();
        long time2 = date1.getTime();

        long time = time2 - time1;

        System.out.println("установка или set заняло столько времени = " + time);

    }

    public static void remove10000(List list) {
        Date date = new Date();
        long time1 = date.getTime();

        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }

        Date date1 = new Date();
        long time2 = date1.getTime();

        long time = time2 - time1;

        System.out.println("удаление или remove заняло столько времени = " + time);
    }
}
