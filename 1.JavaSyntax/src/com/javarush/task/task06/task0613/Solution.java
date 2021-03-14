package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>() ;
        for (int i = 1; i <= 10; i++) {
            Cat cat = new Cat();
            list.add(cat);
        }
        Cat catFive = list.get(5);
        System.out.println(catFive);
        // Создай 10 котов
        System.out.println(Cat.catCount);
        // Выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount = 0;
        // Создай статическую переменную catCount
        public Cat() {
            catCount++;
        }
        // Создай конструктор
    }
}
