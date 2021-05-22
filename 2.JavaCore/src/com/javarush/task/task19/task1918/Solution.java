package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        //String fileName = "C:\\Users\\Acer\\Desktop\\STONKS.txt";
        String readLine;
        String readFileContent = "";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while ((readLine = fileReader.readLine()) != null) {
                readFileContent = readFileContent + readLine;
            }
        }
        String fileContent = readFileContent;

        String openTag = "<" + args[0];
        String closingTag = "</" + args[0];
        int tagLength = args[0].length();
        int startTagIndex = 0;
        int endTagIndex = 0;

        ArrayList<String> tags = new ArrayList<>();

        while ((startTagIndex != -1) && (startTagIndex < fileContent.length())) {
            startTagIndex = fileContent.indexOf(openTag, startTagIndex);
            endTagIndex = fileContent.indexOf(closingTag, startTagIndex + tagLength);

            int indexInTag = startTagIndex + tagLength;
            if (endTagIndex != -1) {
                while (fileContent.substring(indexInTag, endTagIndex).contains(openTag)) {
                    indexInTag = endTagIndex + tagLength;
                    endTagIndex = fileContent.indexOf(closingTag, indexInTag);
                }
            }
            if (startTagIndex != -1 && endTagIndex != -1) {
                tags.add(fileContent.substring(startTagIndex, endTagIndex + tagLength + 3));
                startTagIndex += tagLength;
            }
        }

        for (String tag : tags) {
            System.out.println(tag);
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt