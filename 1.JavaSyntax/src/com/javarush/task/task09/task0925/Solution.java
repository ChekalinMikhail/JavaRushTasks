package com.javarush.task.task09.task0925;

/* 
Статики не на своем месте
*/

public class Solution {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;

        Solution.D = 5;

        int x =1000000127;
        byte y = (byte) x;
        System.out.println(y);
    }

    public int getA() {
        return A;
    }

}
