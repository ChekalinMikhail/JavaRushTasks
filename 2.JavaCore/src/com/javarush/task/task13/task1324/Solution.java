package com.javarush.task.task13.task1324;

/*
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        default void getColor() {

        }

        default void getAge() {

        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
