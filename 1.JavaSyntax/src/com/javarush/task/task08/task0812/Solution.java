package com.javarush.task.task08.task0812;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 0;
        int count1 = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i-1))) {
                count1++;
            }
            else {
                if (count1 > count)
                    count = count1;
                count1 = 1;
            }

        }

        if (count1 > count)
            count = count1;


        System.out.println(count);

        System.out.println("падажи");

        list.forEach(s -> System.out.print(s + " "));

    }
}
