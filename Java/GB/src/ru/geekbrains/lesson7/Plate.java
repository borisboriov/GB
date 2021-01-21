package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Plate {

    protected int food;

    public Plate(int food){
        this.food = food;
    }

    public void info(){
        System.out.println("В тарелке: " + food);
        System.out.println();
    }

  @Override
  public String toString() {
      return "Plate{" +
              "food=" + food +
              '}';
  }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int foodAmount){
        food -= foodAmount;
    }

    public void increaseFood(int foodAmount){
        this.food += foodAmount;
    }



}


