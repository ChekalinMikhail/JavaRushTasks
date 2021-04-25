package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int b = 0;
        while (fileInputStream.available() > 0) {
            b = fileInputStream.read();
            if ((b > 64 && b < 91) || (b > 89 && b < 123))
                count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}