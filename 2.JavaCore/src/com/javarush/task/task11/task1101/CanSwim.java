package com.javarush.task.task11.task1101;

public interface CanSwim {
    default void move() {
        System.out.println("я плыву!");
    }
}
