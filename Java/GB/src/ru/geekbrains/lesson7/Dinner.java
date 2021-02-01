package ru.geekbrains.lesson7;


import java.util.Scanner;

public class Dinner {

    public static void main(String[] args) {

        Plate plate = new Plate(50);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Trump", 55, false);
        cats[1] = new Cat("Kim", 10, false);
        cats[2] = new Cat("Kanya", 7, false);


        plate.info();

        do dinner(cats, plate); while (!ifCatHungry(cats, plate));

        plate.info();


    }

    private static void dinner(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            if (!cat.satiety) {
                cat.eat(plate);
                System.out.println(cat.name + "  сыт? " + cat.satiety);
                System.out.println();
            }
        }

    }

    public static boolean ifCatHungry(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            if (!cat.satiety) {
                System.out.println("Остались голодные коты");
                addFood(plate);
            }
            return false;
        }
        return true;
    }

    public static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Добавьте еды: ");
        int foodCount = scanner.nextInt();
        plate.increaseFood(foodCount);

    }

}


//Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
// (например, в миске 10 еды, а кот пытается покушать 15-20).

//    Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
//    Если коту удалось покушать (хватило еды), сытость = true.

//    Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
//    (это сделано для упрощения логики программы).

//    Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
//    потом вывести информацию о сытости котов в консоль.

//    Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
