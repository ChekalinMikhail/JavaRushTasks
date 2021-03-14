package com.javarush.task.task10.task1014;

/* 
Расставьте минимум static-ов
*/

public class Solution {
    public static class Cat {
        int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Cat(int age) {
            this.age = age;
        }

    }

    //public int A = 5;
    //public static int B = 5;
    //public static int C = 5;
    //public static int D = 5;

    public static void main(String[] args) {
        int x = 7;
        incrementNumber(x);
        System.out.println(x);

        Cat cat = new Cat(7);
        catLevelUp(cat);
        System.out.println(cat.getAge());

    }

    public static void catLevelUp(Cat cat) {

        cat.setAge(cat.getAge()+1);
    }

    public static void incrementNumber(int x) {
        x++;
    }


        //Solution solution = new Solution();
        //solution.A = 5;
        //solution.B = 5 * B;
        //solution.C = 5 * C * D;
        //Solution.D = 5 * D * C;

        //Solution.D = 5;

        //String line = "aaabccdddc";
        //System.out.println(line.chars().distinct().count());

    }

    //public int getA() {
    //    return A;
    //}


