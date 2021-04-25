package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();

        try (FileOutputStream file1Output = new FileOutputStream(file1);
             FileInputStream file2Input = new FileInputStream(file2);
             FileInputStream file3Input = new FileInputStream(file3)) {
            while(file2Input.available() > 0)
                file1Output.write(file2Input.read());
            while(file3Input.available() > 0)
                file1Output.write(file3Input.read());
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt