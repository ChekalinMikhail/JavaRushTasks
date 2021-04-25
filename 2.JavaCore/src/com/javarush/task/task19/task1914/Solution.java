package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        String[] split = getBytes().toString().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);
        int result = 0;
        
        if(split[1].equals("+"))
            result = a + b;
        if(split[1].equals("-"))
            result = a - b;
        if(split[1].equals("*"))
            result = a * b;
        
        System.out.printf("%d %s %d = %s", a, split[1], b, result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }

    public static ByteArrayOutputStream getBytes() {
        PrintStream console = System.out;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(console);
        return stream;

    }
}

