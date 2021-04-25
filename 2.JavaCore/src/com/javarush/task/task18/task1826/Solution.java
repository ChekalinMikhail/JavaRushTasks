package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        FileInputStream fileInputStream = new FileInputStream(args[1]);

        switch (args[0]) {
            case "-e":
                while (fileInputStream.available() > 0)
                    fileOutputStream.write(fileInputStream.read() - 1);
                break;

            case "-d":
                while (fileInputStream.available() > 0)
                    fileOutputStream.write(fileInputStream.read() + 1);
                break;
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
