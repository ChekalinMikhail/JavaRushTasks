package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static Integer getId(String line) {
        return Integer.parseInt(line.substring(0, 8).replaceAll(" ", ""));
    }
    public static void main(String[] args) throws Exception {
        if(args.length != 4)
            return;

        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } //считываем имя файла для работы

        List<String> lines = new ArrayList<>(); //создаем список List для хранения строк из файла

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready())
                lines.add(fileReader.readLine());
        } //заполняем список строками из файла

        int maxIdIndex = 0;
        int maxId = getId(lines.get(0));

        for (int i = 1; i < lines.size(); i++) {
            int id = getId(lines.get(i));
            if (id > maxId) {
                maxId = id;
                maxIdIndex = i;
            }
        } //поиск максимального Id в файле

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            fileWriter.write(String.format("\n%-8d%-30s%-8s%-4s", maxId + 1, args[1], args[2], args[3]));
        } //добавляем новую строку в файл
    }
}
//C:\Users\Acer\Desktop\STONKS.txt