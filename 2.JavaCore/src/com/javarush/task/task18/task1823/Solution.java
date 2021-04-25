package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while (!((line = reader.readLine()).equals("exit"))) {
            ReadThread thread = new ReadThread(line);
            thread.join();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            start();

        }

        @Override
        public void run() {
            int[] bytes = new int[256];
            try {
                FileInputStream fileRead = new FileInputStream(fileName);
                while (fileRead.available() > 0) {
                    bytes[fileRead.read()]++;
                }
                fileRead.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
            int max = bytes[0];
            int maxByte = 0;
            for (int i = 1; i < bytes.length; i++) {
                if (bytes[i] > max) {
                    max = bytes[i];
                    maxByte = i;
                }
            }
            resultMap.put(fileName, maxByte);
        }
    }
}
//C:\Users\Acer\Desktop\STONKS.txt