package com.javarush.task.task19.task1916;

import java.io.*;
import java.net.URL;
import java.util.*;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static final String FIRST_FILE = "/Users/Ian_Rakhmatullin/Desktop/First.txt";
    public static final String SECOND_FILE = "/Users/Ian_Rakhmatullin/Desktop/Second.txt";
    public static List<LineItem> lines = new ArrayList<LineItem>();

    private static String previousFromFirst = null;
    private static String previousFromSecond = null;
    private static boolean firstIsOver = false;
    private static boolean secondIsOver = false;


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

        yanSolution();
    }

    public static void yanSolution() throws IOException {
//        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
//        String file1 = fileNameReader.readLine();
//        String file2 = fileNameReader.readLine();
//        fileNameReader.close();


        BufferedReader file1Reader = new BufferedReader(new FileReader(FIRST_FILE));
        BufferedReader file2Reader = new BufferedReader(new FileReader(SECOND_FILE));

        while (file1Reader.ready() || file2Reader.ready())
        {
            firstIsOver = !file1Reader.ready();
            secondIsOver = !file2Reader.ready();

            String lineToCompare1;
            String lineToCompare2;

            if (previousFromFirst != null && previousFromSecond != null){
                //force reading from files if available, since the last comparison between read lines was unsuccessful
                lineToCompare1 = file1Reader.ready() ? file1Reader.readLine() : previousFromFirst;
                lineToCompare2 = file2Reader.ready() ? file2Reader.readLine() : previousFromSecond;
            }
            else { //we only need to read from one file, since ADDED or REMOVED clause was satisfied in previous 'process'
                // and only one of previous values is null
                lineToCompare1 = (previousFromFirst == null && file1Reader.ready()) ? file1Reader.readLine() : previousFromFirst;
                lineToCompare2 = (previousFromSecond == null && file2Reader.ready()) ? file2Reader.readLine() : previousFromSecond;
            }
            process(lineToCompare1, lineToCompare2);
        }

        Optional.ofNullable(previousFromFirst).ifPresent(a -> lines.add(new LineItem(Type.REMOVED, a)));
        Optional.ofNullable(previousFromSecond).ifPresent(a -> lines.add(new LineItem(Type.ADDED, a)));

        file1Reader.close();
        file2Reader.close();

        lines.forEach(System.out::println);
    }

    /**
     * Process lines and fills the list.
     *
     * @param lineToCompare1 either a fresh written line, or line from the previous reading from the first file
     * @param lineToCompare2 either a fresh written line, or line from the previous reading from the second file
     */
    private static void process(String lineToCompare1, String lineToCompare2) {
        if (lineToCompare1 == null || lineToCompare2 == null){  //EOF
           //updating the last values if any are present
            previousFromFirst = lineToCompare1;
            previousFromSecond = lineToCompare2;
            return;
        }

        if (lineToCompare2.equals(previousFromFirst)) {
            lines.add(new LineItem(Type.ADDED, previousFromSecond));
            lines.add(new LineItem(Type.SAME, previousFromFirst));
            previousFromSecond = null;
            previousFromFirst = firstIsOver ? null : lineToCompare1;
        } else if (lineToCompare1.equals(previousFromSecond)) {
            lines.add(new LineItem(Type.REMOVED, previousFromFirst));
            lines.add(new LineItem(Type.SAME, previousFromSecond));
            previousFromFirst = null;
            previousFromSecond = secondIsOver ? null : lineToCompare2;
        } else if (lineToCompare1.equals(lineToCompare2)) {//return the same
            lines.add(new LineItem(Type.SAME, lineToCompare1));
            previousFromFirst = null;
            previousFromSecond = null;
        } else { //then s1 is not equal to s2, saving them for the future
            previousFromFirst = lineToCompare1;
            previousFromSecond = lineToCompare2;
        }
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
