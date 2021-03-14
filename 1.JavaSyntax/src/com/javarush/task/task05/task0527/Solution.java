package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat TomCat = new Cat("Tom", "gray", 5);
        Dog SpikeDog = new Dog("Spyke", 5, 20);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        String color;
        int whiskers;

        public Cat(String name, String color, int whiskers) {
            this.name = name;
            this.color = color;
            this.whiskers = whiskers;
        }
    }

    public static class Dog {
        String name;
        int age;
        int weight;

        public Dog(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
    //напишите тут ваш код
}
