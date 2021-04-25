package com.javarush.task.task19.task1904;


import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        Person person = new PersonScannerAdapter(new Scanner(new FileReader(args[0]))).read();
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String lastName = fileScanner.next();
            String firstName = fileScanner.next();
            String middleName = fileScanner.next();
            int day = Integer.parseInt(fileScanner.next());
            int month = Integer.parseInt(fileScanner.next()) - 1;
            int year = Integer.parseInt(fileScanner.next());
            Calendar birthday = new GregorianCalendar(year, month, day);

            return new Person(firstName, middleName, lastName, birthday);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }

}
//C:\Users\Acer\Desktop\STONKS.txt