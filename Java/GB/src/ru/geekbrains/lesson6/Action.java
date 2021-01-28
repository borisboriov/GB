package ru.geekbrains.lesson6;

import java.util.Random;

public class Action {

    public static void main(String[] args) {

        Animal[] pets = generatePets();
        action(pets);

    }

    private static Animal[] generatePets(){
        return new Animal[] {
                new Cat(200, 2),
                new Dog(500, 10,1)
        };
    }

    private static void action(Animal[] pets){
        Random random = new Random();

        for ( Animal pet : pets) {
            pet.printInfo();
            System.out.println(pet.run(random.nextInt(500)));
            System.out.println(pet.swim(random.nextInt(20)));
            System.out.println(pet.jump(random.nextInt(5)));

        }
    }


}


//             }
//      cat.run(math.ra


//Cat[] cats = new Cat[5];
//Dog[] dogs = new Dog[5];

//
//    for (int i = 0; i < cats.length; i++) {
//        dogs[i] =


//    }


