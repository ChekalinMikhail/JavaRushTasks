package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String data;

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                if ((data = reader.readLine()) != null) {
                    String name = data.replaceAll("\\d", "").trim(); //"..+[^\d\s]" - регулярка для поиска Name в строке, не работает если какого-то хуя в имени есть ЦИФРЫ
                    String[] line = data.split(" ");
                    int year = Integer.parseInt(line[line.length - 1]);
                    int month = Integer.parseInt(line[line.length - 2]) - 1;
                    int day = Integer.parseInt(line[line.length - 3]);
                    Calendar birthDay = new GregorianCalendar(year,month, day);
                    PEOPLE.add(new Person(name, birthDay.getTime()));
                }
            }
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt