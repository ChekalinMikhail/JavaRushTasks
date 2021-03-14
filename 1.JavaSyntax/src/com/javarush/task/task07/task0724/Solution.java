package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("Ivan", true, 70);
        Human ded2 = new Human("Vasya", true, 71);
        Human babka1 = new Human("Ira", false, 69);
        Human babka2 = new Human("Tamara", false, 79);
        Human batya = new Human("Gosha", true, 35, ded1, babka1);
        Human mama = new Human("Masha", false, 34, ded2, babka2);
        Human kid1 = new Human("Petya", true, 10, batya, mama);
        Human kid2 = new Human("Igor", true, 7, batya, mama);
        Human kid3 = new Human("Katya", false, 3, batya, mama);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(batya);
        System.out.println(mama);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}