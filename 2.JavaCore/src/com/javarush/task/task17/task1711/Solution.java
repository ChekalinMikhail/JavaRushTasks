package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static SimpleDateFormat formatterIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat formatterOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {
        Person person;
        Date date;

        switch (args[0]) {
            case ("-c"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м"))
                            person = Person.createMale(args[i], formatterIn.parse(args[i + 2]));
                        else
                            person = Person.createFemale(args[i], formatterIn.parse(args[i + 2]));

                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }

            case ("-u"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i]);
                        person = allPeople.get(id);
                        person.setName(args[i + 1]);
                        person.setBirthDate(formatterIn.parse(args[i + 3]));
                        if (args[i + 2].equals("м"))
                            person.setSex(Sex.MALE);
                        if (args[i + 2].equals("ж"))
                            person.setSex(Sex.FEMALE);
                    }
                    break;
                }

            case ("-d"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                    break;
                }

            case ("-i"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        String sex;
                        if (person.getSex().equals(Sex.MALE))
                            sex = "м";
                        else
                            sex = "ж";

                        System.out.println(person.getName() + " " + sex + " " + formatterOut.format(person.getBirthDate()));
                    }
                    break;
                }
        }
    }
}
