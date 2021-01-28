package ru.geekbrains.lesson6;

public  class Cat  extends  Animal {

    public static final int catRunLimit = 200;
    public static final int catSwimLimit = 0;
    public static final int catJumpLimit = 2;


    public Cat(int runLimit, int jumpLimit){
        super(runLimit,jumpLimit, catSwimLimit);
    }

    @Override
    public boolean run(int distance){
        if (this.catRunLimit >= distance){
            System.out.printf("Кошка пробежала", distance, catRunLimit);
            return true;
        }
        System.out.printf("Кошка не пробежала", distance, catRunLimit);
        return false;
    }
    @Override
    public boolean swim(int distance){
        if (this.catSwimLimit >= distance){
            System.out.printf("Кошка проплыла", distance, catSwimLimit);
            return true;
        }
        System.out.printf("Кошка  утонула", distance, catSwimLimit);
        return false;
    }

    @Override
    public boolean jump(int distance){
        if (this.catJumpLimit >= distance){
            System.out.printf("Кошка перепрыгнула", distance, catJumpLimit);
            return true;
        }
        System.out.printf("Кошка  не допрыгнула", distance, catJumpLimit);
        return false;
    }

}
