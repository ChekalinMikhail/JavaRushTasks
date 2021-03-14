package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String fild1;
        private String fild2;
        private String fild3;
        private String fild4;
        private String fild5;
        private int fild6;

        public Human() {
        }

        public Human(String fild1) {
            this.fild1 = fild1;
        }

        public Human(String fild1, String fild2, String fild3) {
            this.fild1 = fild1;
            this.fild2 = fild2;
            this.fild3 = fild3;
        }

        public Human(String fild1, String fild2) {
            this.fild1 = fild1;
            this.fild2 = fild2;
        }

        public Human(String fild1, String fild2, String fild3, String fild4) {
            this.fild1 = fild1;
            this.fild2 = fild2;
            this.fild3 = fild3;
            this.fild4 = fild4;
        }

        public Human(String fild1, String fild2, String fild3, String fild4, String fild5) {
            this.fild1 = fild1;
            this.fild2 = fild2;
            this.fild3 = fild3;
            this.fild4 = fild4;
            this.fild5 = fild5;
        }

        public Human(String fild1, int fild6) {
            this.fild1 = fild1;
            this.fild6 = fild6;
        }

        public Human(String fild1, String fild2, int fild6) {
            this.fild1 = fild1;
            this.fild2 = fild2;
            this.fild6 = fild6;

        }

        public Human(String fild1, String fild2, String fild3, String fild4, String fild5, int fild6) {
            this.fild1 = fild1;
            this.fild2 = fild2;
            this.fild3 = fild3;
            this.fild4 = fild4;
            this.fild5 = fild5;
            this.fild6 = fild6;
        }

        public Human(String fild2, String fild3, String fild4, String fild5, int fild6) {
            this.fild2 = fild2;
            this.fild3 = fild3;
            this.fild4 = fild4;
            this.fild5 = fild5;
            this.fild6 = fild6;
        }

    }
}
