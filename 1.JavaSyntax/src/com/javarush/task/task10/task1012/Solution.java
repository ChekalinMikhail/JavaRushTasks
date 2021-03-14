package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        List<Character> massiveofstrings = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char[] chars = list.get(i).toCharArray();
            for(int j = 0; j < chars.length; j++) {
                massiveofstrings.add(chars[j]);
            }
        }

        alphabet.forEach(s -> count(s, massiveofstrings) );
    }

    public static void count(char simbol, List<Character> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(simbol))
                count++;
        }

        System.out.println(simbol + " " + count);
    }
}
