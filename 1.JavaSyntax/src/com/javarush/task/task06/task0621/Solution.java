package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat grandfather = new Cat(grandfatherName, null, null);

        String grandmotherName = reader.readLine();
        Cat grandmother = new Cat(grandmotherName, null, null);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grandfather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, grandmother, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String dotherName = reader.readLine();
        Cat dother = new Cat(dotherName, mother, father);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(dother);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";

            if (mother == null)
            return "The cat's name is " + name + ", no mother, father is " + father.name;

            if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";

            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
