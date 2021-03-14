package com.javarush.task.task12.task1232;

/* 
Нужно добавить в программу новую функциональность
*/


public class Solution {
    public static void main(String[] args) {
        Season[] seasons = Season.values();
        for (Season s : seasons)
            System.out.println(s);

        System.out.println(Season.SUMMER.ordinal());

    }
}
