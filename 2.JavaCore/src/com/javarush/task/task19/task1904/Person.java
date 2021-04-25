package com.javarush.task.task19.task1904;

import java.util.Calendar;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Calendar birthDate;

    public Person(String firstName, String middleName, String lastName, Calendar birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.getTime().toString());
    }
}
