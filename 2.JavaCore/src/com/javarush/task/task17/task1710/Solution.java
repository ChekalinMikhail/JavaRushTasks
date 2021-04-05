package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat formatterIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formatterOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person;
        Date date;

        switch (args[0]) {
            case ("-c"):
                if (args[2].equals("м"))
                    person = Person.createMale(args[1], formatterIn.parse(args[3]));
                else
                    person = Person.createFemale(args[1], formatterIn.parse(args[3]));

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;

            case ("-u"):
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                person.setName(args[2]);
                person.setBirthDate(formatterIn.parse(args[4]));
                if (args[3].equals("м"))
                    person.setSex(Sex.MALE);
                if (args[3].equals("ж"))
                    person.setSex(Sex.FEMALE);
                break;

            case ("-d"):
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                break;

            case ("-i"):
                person = allPeople.get(Integer.parseInt(args[1]));
                String sex;
                if (person.getSex().equals(Sex.MALE))
                    sex = "м";
                else
                    sex = "ж";

                System.out.println(person.getName() + " " + sex + " " + formatterOut.format(person.getBirthDate()));
                break;
        }
    }
}
