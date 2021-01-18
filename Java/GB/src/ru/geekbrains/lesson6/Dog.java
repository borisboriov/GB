package ru.geekbrains.lesson6;

public class Dog extends Animal   {

    public static final int dogRunLimit = 500;
    public static final int dogSwimLimit = 10;
    public static final int dogJumpLimit = 1;


    public Dog(int runLimit, int swimLimit, int jumpLimit){
        super(runLimit, swimLimit,  jumpLimit);
    }

    @Override
    public boolean run(int distance){
        if (this.dogRunLimit >= distance){
            System.out.printf("Собака пробежала", distance, dogRunLimit);
            return true;
        }
        System.out.printf("Собака не пробежала", distance, dogRunLimit);
        return false;
    }
    @Override
    public boolean swim(int distance){
        if (this.dogSwimLimit >= distance){
            System.out.printf("Собака проплыла", distance, dogSwimLimit);
            return true;
        }
        System.out.printf("Собака  утонула", distance, dogSwimLimit);
        return false;
    }

    @Override
    public boolean jump(int distance){
        if (this.dogJumpLimit >= distance){
            System.out.printf("Собака перепрыгнула", distance, dogJumpLimit);
            return true;
        }
        System.out.printf("Собака  не допрыгнула", distance, dogJumpLimit);
        return false;
    }

}
