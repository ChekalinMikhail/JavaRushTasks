package com.javarush.task.task05.task0525;

public class Cock implements sex, abc {

    @Override
    public void goFuck() {
        sex.super.goFuck();
        abc.super.goFuck();
    }
}
