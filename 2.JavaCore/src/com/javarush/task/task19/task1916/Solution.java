package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
//        String file1, file2;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            file1 = reader.readLine();
//            file2 = reader.readLine();
//        }
//
//        String file1line1 = null;
//        String file2line1 = null;
//        String file1line2, file2line2;
//        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
//             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
//            while (reader1.ready() && reader2.ready()) {
//                if (file1line1 == null)
//                    file1line1 = reader1.readLine();
//                if (file2line1 == null)
//                    file2line1 = reader2.readLine();
//                if (file1line1.equals(file2line1)) {
//                    lines.add(new LineItem(Type.SAME, file2line1));
//                    file1line1 = null;
//                    file2line1 = null;
//                } else {
//                    file1line2 = reader1.readLine();
//                    file2line2 = reader2.readLine();
//                    if (file1line1.equals(file2line2)) {
//                        lines.add(new LineItem(Type.ADDED, file2line1));
//                        file2line1 = null;
//                        lines.add(new LineItem(Type.SAME, file1line1));
//                        file1line1 = file1line2;
//                    } else if (file2line1.equals(file1line2)) {
//                        lines.add(new LineItem(Type.REMOVED, file1line1));
//                        file1line1 = null;
//                        lines.add(new LineItem(Type.SAME, file2line1));
//                        file2line1 = file2line2;
//                    }
//                }
//            }
//            if (file1line1 != null)
//                lines.add(new LineItem(Type.REMOVED, file1line1));
//            if (file2line1 != null)
//                lines.add(new LineItem(Type.ADDED, file2line1));
//        }
//        for (LineItem s : lines)
//            System.out.println(s);
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
