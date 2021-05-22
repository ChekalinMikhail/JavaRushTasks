package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Acer\\Desktop\\STONKS.txt"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Acer\\Desktop\\STONKS.txt"))) {

            Solution solution = new Solution("C:\\Users\\Acer\\Desktop\\STONKS1.txt");
            solution.writeObject("You are lion");

            outputStream.writeObject(solution);

            Solution solution2 = (Solution) inputStream.readObject();

            solution2.writeObject("You are cat");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//C:\Users\Acer\Desktop\STONKS.txt
