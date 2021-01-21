package ru.geekbrains.lesson7;

public class Cat {
    protected String name;
    private int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String  getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean appetite) {
        this.satiety = satiety;
    }


    public void eat(Plate plate) {
        if (this.appetite < plate.food) {
            plate.decreaseFood(appetite);
            this.satiety = true;
//            setSatiety(true);
            System.out.println(this.name + " съел:" + appetite);
//            return true;
        } else {

            System.out.println(this.name + " не хватило вискаса");
 //           return false;
        }


    }
}


