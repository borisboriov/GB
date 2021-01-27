package ru.geekbrains.Lesson9.model;

import java.util.Random;

public class Treadmill {

    Random random = new Random();

    protected int length;

    public Treadmill(){
        this.length = random.nextInt(400);
    }

}
