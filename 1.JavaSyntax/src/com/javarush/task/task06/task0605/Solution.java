package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            String result = "";
            double index = weight / (height * height);
            if (index < 18.5) {
                result = "Недовес: меньше чем 18.5";
            }
            if (index >= 18.5 && index < 25) {
                result = "Нормальный: между 18.5 и 25";
            }
            if (index >= 25 && index < 30) {
                result = "Избыточный вес: между 25 и 30";
            }
            if (index > 30) {
                result = "Ожирение: 30 или больше";
            }
            System.out.println(result);
            // напишите тут ваш код
        }
    }
}
