package com.javarush.task.task11.task1103;

/* 
Межпланетная ферма
*/

public class Solution {
    public static void main(String[] args) {
        Object object = new Tiger();
        Animal animal = (Animal) object;
        Cat cat = (Cat) object;
        Tiger tiger = (Tiger) object;
    }

    public static class Animal {
        public void animalDo() {
            System.out.println("animal");
        }
    }

    public static class Cat extends Animal {
        public void catDo() {
            System.out.println("cat");
        }
    }

    public static class Tiger extends Cat {
        public void tigerDo() {
            System.out.println("tiger");
        }
    }

}