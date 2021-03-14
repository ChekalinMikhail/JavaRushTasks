package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanchenko","Maria");
        map.put("Popov","Valik");
        map.put("Lepeha","Andrey");
        map.put("Kuksa","Daria");
        map.put("Popov","Grisha");
        map.put("Popov","Semen");
        map.put("Obertiy","Daria");
        map.put("Kubasova","Kris");
        map.put("Gresko","Lisa");
        map.put("Perevertaylo","Daria");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
