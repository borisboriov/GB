package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9. \nУ Вас есть 3 попытки.");
        guessNumber();

        int z = playOrNot();

        for (;;)
        {
            if (playOrNot() == 1)
            {
                guessNumber();
            } else
            {
                break;
            }
        }

    }

     static void   guessNumber()
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int x = rand.nextInt(10);
        int maxTryCount = 3;
        int userAnswer;



        for (int tryCount = 0; tryCount < maxTryCount; tryCount++) {
            System.out.println("Введите число:");
            userAnswer = scanner.nextInt();
            if (userAnswer == x) {
                System.out.println("Вы угадали. Правильный ответ:" + userAnswer);
                break;
            } else if (userAnswer > x) {
                System.out.println("Загаданное число меньше");
            } else if (userAnswer < x) {
                System.out.println("Загаданное число больше");
            }
            if (tryCount >= 3)
            {
                System.out.println("Вы проиграли. Правильный ответ: " + x);
            }

        }


    }

   public static int playOrNot()
    {
        Scanner scanner = new Scanner(System.in);
        int z;

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        z = scanner.nextInt();

        return z;
    }




}


//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
// static int guessNumber() {
//        Random rand = new Random();
//        int x = rand.nextInt(10);
//
//        Scanner scan = new Scanner(System.in);
//        int y = 0;
//
//
//        while (y < 9 || y < 0) {
//            System.out.println("Попытка №1");
//            y = scan.nextInt();
//            if (y > x) {
//                System.out.println("Число больше загадонного");
//            }
//            if (y < x) {
//                System.out.println("Число меньше загадонного");
//            } else if (y == x)
//            {
//                System.out.println("Вы угадали. Правильный ответ - " + x);
//            }
//
//
//        }
//        return y;
//
//    }