package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String line = reader.readLine();
            while (true) {
                writer.write(line + "\n");

                if (line.equals("exit"))
                    break;

                line = reader.readLine();

            }
        }
    }
}
