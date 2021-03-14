package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbersBig = new int[20];

        for (int i = 0; i < numbersBig.length; i ++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            numbersBig[i] = Integer.parseInt(reader.readLine());
        }

        int[] numbersLittle1 = new int[10];
        int[] numbersLittle2 = new int[10];

        for (int i = 0; i < numbersLittle1.length; i++) {
            numbersLittle1[i] = numbersBig[i];
        }

        for (int i = 0; i < numbersLittle2.length; i++) {
            numbersLittle2[i] = numbersBig[i+10];
        }

        for (int i = 0; i < numbersLittle2.length; i++) {
            System.out.println(numbersLittle2[i]);
        }
        //напишите тут ваш код
    }
}
