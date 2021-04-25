package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        for (String s : args)
            System.out.println(s);

        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } //считываем имя файла для работы

        List<String> lines = new ArrayList<>(); //создаем список List для хранения строк из файла

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready())
                lines.add(fileReader.readLine());
        } //заполняем список строками из файла

        switch (args[0]) {
            case ("-u"): //заменяем строку с необходимым id
                String update = String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]);
                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i).substring(0, 8).replaceAll(" ", "").equals(args[1])) {
                        lines.remove(i);
                        lines.add(i, update);
                    }
                }
                break;

            case ("-d"): //удаляем строку с заданным id
                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i).substring(0, 8).replaceAll(" ", "").equals(args[1]))
                        lines.remove(i);
                }
                break;
        }

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (String s : lines)
                fileWriter.write(s + "\n");
        } //добавляем строки из списка в файл с нуля
    }
}
//198479
//C:\Users\Acer\Desktop\STONKS.txt