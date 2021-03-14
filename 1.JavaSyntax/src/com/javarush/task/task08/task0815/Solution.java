package com.javarush.task.task08.task0815;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Пупкин", "Вася");
        map.put("Горин", "Гена");
        map.put("Челентано", "Адриано");
        map.put("Конь", "Педальный");
        map.put("Шлюх", "Шлюхович");
        map.put("Перец", "Красный");
        map.put("Бандерас", "Антонио");
        map.put("Первый", "Петя");
        map.put("Хер", "Моржовый");
        map.put("Блабла", "Блаблабла");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countName = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name)) {
                countName++;
            }
        }

        return countName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLastName = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(lastName)) {
                countLastName++;
            }
        }

        return countLastName;

    }

    public static void main(String[] args) {


    }
}
