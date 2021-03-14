package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Пупкин", "Вася");
        map.put("Горин", "Гена");
        map.put("Челентано", "Гена");
        map.put("Конь", "Педальный");
        map.put("Шлюх", "Шлюхович");
        map.put("Перец", "Красный");
        map.put("Бандерас", "Антонио");
        map.put("Первый", "Вася");
        map.put("Хер", "Моржовый");
        map.put("Блабла", "Вася");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //Map<String, String> map1 = new HashMap<>(map);
        //for (Map.Entry<String, String> pair : map1.entrySet()) {
        //    String value = pair.getValue();
        //    removeItemFromMapByValue(map, value);

        //это старое решение которое сам придумал

        List<String> duplicates = new ArrayList<>();

        for (Map.Entry<String, String> pair : map.entrySet()){
            if(Collections.frequency(map.values(), pair.getValue()) > 1){
                duplicates.add(pair.getValue());
            }
        }

        for (String name : duplicates) {
            removeItemFromMapByValue(map, name);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        //int count = 0;
        //Map<String, String> copy = new HashMap<>(map);
        //for (Map.Entry<String, String> pair : copy.entrySet()) {
        //    if (pair.getValue().equals(value)) {
        //        count++;
        //    }
        //}

        //if (count > 1) {
        //    for (Map.Entry<String, String> pair : copy.entrySet()) {
        //        if (pair.getValue().equals(value)) {
        //            map.remove(pair.getKey());
        //        }
        //    }

        //это старое решение, подсмотрел функцию frequency(частота) и получилось всё намного проще

        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        map.forEach((a, b) -> System.out.println(a + " " + b));

    }
}
