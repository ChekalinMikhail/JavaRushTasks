package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(0.1, "0.11");
        labels.put(0.2, "0.22");
        labels.put(0.3, "0.33");
        labels.put(0.4, "0.44");
        labels.put(0.5, "0.55");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
