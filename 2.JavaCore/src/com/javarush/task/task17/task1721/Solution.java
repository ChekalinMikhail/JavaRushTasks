package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        Scanner scanner1 = new Scanner(new BufferedInputStream(new FileInputStream(fileName1)));
        Scanner scanner2 = new Scanner(new BufferedInputStream(new FileInputStream(fileName2)));

        while(scanner1.hasNext())
            allLines.add(scanner1.nextLine());

        while(scanner2.hasNext())
            forRemoveLines.add(scanner2.nextLine());

        Solution solution = new Solution();
        solution.joinData();
        reader.close();
        scanner1.close();
        scanner2.close();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            for (String s : forRemoveLines)
                allLines.remove(s);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt