package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Ivan", 21, "Perm");
        Man man2 = new Man("Igor", 33, "Piter");
        Woman woman1 = new Woman("Ira", 18, "Samara");
        Woman woman2 = new Woman("Kate", 34, "MSK");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
        //напишите тут ваш код
    }

    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    //напишите тут ваш код
}
