package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);

        testString.printSomething();

        System.setOut(consoleStream);

        System.out.println(stream.toString().toUpperCase());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
