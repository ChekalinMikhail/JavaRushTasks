package com.javarush.task.task06.task0622;

class Sol {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
                    numbers[i] = i + 22;
        }

        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
}

