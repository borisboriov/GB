package ru.geekbrains.lesson6;

public abstract class  Animal {

    protected int runLimit;
    protected int swimLimit;
    protected int jumpLimit;



    public Animal(int runLimit, int swimLimit, int jumpLimit){
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }



    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public int getJumpLimit() { return jumpLimit; }


    public abstract boolean run(int distance);

    public abstract boolean swim(int distance);

    public abstract boolean jump(int height);

    public void printInfo(){
        System.out.println(this);
    }


    @Override
    public String toString(){

        return this.getClass().getSimpleName() + "{" +
                "runLimit=" + runLimit +
                ", swimLimit=" + swimLimit +
                ", jumoLimit=" + jumpLimit +
                "}";


    }

}
