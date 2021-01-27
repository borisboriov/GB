package ru.geekbrains.Lesson9;


import ru.geekbrains.Lesson9.model.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


    Object[] participants = generateParticipants();
    Object[] obstacles = generateObstacles();
    participants = generateParticipants();


      }




    private static Object[] generateObstacles() {
        Object[] obstacles = new Object[5];
        for (int i = 0; i <= 2; i++) {
            obstacles[i] = new Treadmill();
        }
        for (int i = 3; i <= obstacles.length; i++) {
            obstacles[i] = new Wall();
        }
        return obstacles;
    }

    private static Object[] generateParticipants() {
        Random random = new Random();

        Object[] participants = new Object[8];
        for (int i = 0; i <= 2; i++) {
            participants[i] = new Cat("Кот№ " + i, random.nextInt(3), random.nextInt(600));
        }
        for (int i = 3; i <= 5; i++) {
            participants[i] = new Human("Чел№ " + i, random.nextInt(2), random.nextInt(400));
        }
        for (int i = 6; i <= participants.length; i++) {
            participants[i] = new Robot("Робот№" + i, random.nextInt(1), random.nextInt(500));
        }
        return participants;
        }
    }


//1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

//2.Создайте два класса: беговая дорожка и стена, при прохождении через которые,
// участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

//3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

//4* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.