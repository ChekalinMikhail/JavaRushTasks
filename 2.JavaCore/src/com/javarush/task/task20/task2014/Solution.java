package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution savedObject = new Solution(4);
        System.out.println(savedObject);
        File file = new File("C:\\Users\\Acer\\Desktop\\STONKS.txt");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(savedObject);
        }
        Solution loadedObject = new Solution(1);
        System.out.println(loadedObject);
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            loadedObject = (Solution) in.readObject();
        }
        System.out.println(loadedObject);
        System.out.println(savedObject.string.equals(loadedObject.string));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
