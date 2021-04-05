package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
        System.out.println("создался синглтон");
    }

    static {
        System.out.println("статический блок");
    }
}
