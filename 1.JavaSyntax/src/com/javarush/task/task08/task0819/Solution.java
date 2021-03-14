package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        cats.remove(cats.toArray()[0]);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        cats.forEach(s -> System.out.println(s));
    }

    public static class Cat {

    }
}
