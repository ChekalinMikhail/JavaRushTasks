package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Введите размер списка N");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        System.out.println("Введите целые числа для списка");
        for (int i = 0; i < N; i++) {
            integerList.add(Integer.parseInt(reader.readLine()));
        }
        return integerList;
    }
}
