package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) throws  Exception {
        Human child1 = new Human("ребенок1", true, 1);
        Human child2 = new Human("ребенок2", true, 5);
        Human child3 = new Human("ребенок3", false, 10);
        Human father = new Human("отец", true, 40, child1, child2, child3);
        Human mother = new Human("мама", false, 39, child1, child2, child3);
        Human grandfather1 = new Human("дед1", true,70, father);
        Human grandfather2 = new Human("дед2", true,71, mother);
        Human grandmother1 = new Human("бабка1", false,70, father);
        Human grandmother2 = new Human("бабка2", false,71, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children, children);
        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
