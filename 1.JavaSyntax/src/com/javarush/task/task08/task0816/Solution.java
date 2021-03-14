package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("M d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("5 1 2012"));
        map.put("Иванов", dateFormat.parse("7 1 2012"));
        map.put("Петров", dateFormat.parse("6 1 2012"));
        map.put("Борисов", dateFormat.parse("2 1 2012"));
        map.put("Антонов", dateFormat.parse("1 1 2012"));
        map.put("Михайлов", dateFormat.parse("7 1 2012"));
        map.put("Дебилов", dateFormat.parse("3 1 2012"));
        map.put("Петттттров", dateFormat.parse("2 1 2012"));
        map.put("Заебался", dateFormat.parse("8 1 2012"));
        map.put("Очень", dateFormat.parse("11 1 2012"));

        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if (month > 4 && month < 8)
                iterator.remove();

        }

    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        map.forEach((a,b) -> System.out.println(a + "  " + b));
    }
}
