package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
             FileOutputStream fileOutputStream = new FileOutputStream(new Scanner(System.in).nextLine())) {
            List<Integer> list = new ArrayList<>();
            while (fileInputStream.available() > 0)
                list.add(fileInputStream.read());
            Collections.reverse(list);
            for (Integer i : list)
                fileOutputStream.write(i);
        }
    }
}
