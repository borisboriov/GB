package ru.geekbrains.Level2.Lesson2;

public class MyArrayDataException extends Exception{

    int i;
    int j;


    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
