package com.javarush.task.task11.task1121;

/* 
Чужой код, незнакомый
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.tiKto();
        pet.voice();
        ((Cat) pet).ktonasral();
        pet.voice();
        Cat cat = (Cat) pet;
        cat.ktonasral();
        ((Cat) pet).jivotnoe();
    }

    public static class Pet {
        public void voice() {
            System.out.println("иди нахуй");
        }

        public void tiKto() {
            System.out.println("я животное нахуй");
        }
    }

    public static class Cat extends Pet {
        public void voice() {
            System.out.println("мяу");
        }

        public void ktonasral() {
            System.out.println("не я, мяу");
        }

        public void jivotnoe() {
            super.voice();
        }
    }
}
