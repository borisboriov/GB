package ru.geekbrains.Lesson9.model;

import java.util.Random;

public class Wall {

    Random random = new Random();

    protected int length;

    public Wall(){
        this.length = random.nextInt(3);
    }

}
