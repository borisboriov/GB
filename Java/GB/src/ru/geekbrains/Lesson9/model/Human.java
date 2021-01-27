package ru.geekbrains.Lesson9.model;

public class Human {

    protected String name;
    protected int jumpLimit;
    protected int runLimit;

    public Human(String name, int jumpLimit, int runLimit){
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }


    public void run(){
        System.out.println("Человек пробежал");
    }
    public void jump(){
        System.out.println("Человек перепрыгнул");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", jumpLimit=" + jumpLimit +
                ", runLimit=" + runLimit +
                '}';
    }
}

