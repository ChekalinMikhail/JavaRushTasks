package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 100);
        map.put("Иванов1", 500);
        map.put("Иванов2", 1000);
        map.put("Иванов3", 1000);
        map.put("Иванов4", 1000);
        map.put("Иванов5", 200);
        map.put("Иванов6", 10000);
        map.put("Иванов7", 300);
        map.put("Иванов8", 100);
        map.put("Иванов9", 50);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {


    }
}