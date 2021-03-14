package com.javarush.task.task11.task1114;

/* 
Происхождение видов
*/

public class Solution {
    public static void main(String[] args) {
    }

    public abstract class Fish {
        public abstract void voice();
    }

    public class Lizard extends Fish {

        @Override
        public void voice() {

        }
    }

    public class Dinosaur extends Lizard {

        @Override
        public void voice() {

        }

    }

}
