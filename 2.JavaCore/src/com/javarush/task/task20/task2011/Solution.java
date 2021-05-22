package com.javarush.task.task20.task2011;

import java.io.*;

/* 
Externalizable для апартаментов
*/

public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
            out.flush();
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            this.address = (String) in.readObject();
            this.year = in.readInt();
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Acer\\Desktop\\STONKS.txt");
        Apartment apartment1 = new Apartment("Pushkina st.", 1837);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(apartment1);
        }
        Apartment apartment2 = new Apartment();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            apartment2 = (Apartment) ois.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception! Class not found!");
        }
        System.out.println(apartment1);
        System.out.println(apartment2);
    }
}
//C:\Users\Acer\Desktop\STONKS.txt