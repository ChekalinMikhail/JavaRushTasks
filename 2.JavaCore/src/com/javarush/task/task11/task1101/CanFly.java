package com.javarush.task.task11.task1101;

public interface CanFly {
    default void move() {
        System.out.println("я лечу!");
    }
}
