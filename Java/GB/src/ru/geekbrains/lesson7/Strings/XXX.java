package ru.geekbrains.lesson7.Strings;

import sun.lwawt.macosx.CSystemTray;

import java.awt.*;

public class XXX {

    public static void main(String[] args) {


        String s1 = "I like Java";

        method1(s1);//№1

        char result1 = s1.charAt(10); //#2

        System.out.println("Задание №2 " + result1);


        boolean endWith;
        endWith = s1.endsWith("!!!");
        System.out.println("Задание №3 " + "заканчивается ли s1 на !!!: " + endWith);// №3


//г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().

        boolean startWith;
        startWith = s1.startsWith("I like");
        System.out.println("Задание №4 " + "s1 начинается с I like Java?: " + startWith);

//д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод

        boolean ifContains = s1.contains("Java");
        System.out.println("Задание №5 " + "s1 содержит Java: " + ifContains);

//e) Найти позицию подстроки “Java” в строке “I like Java!!!”.


//ж) Заменить все символы “а” на “о”.

        System.out.println("Задание №7 " + s1.replace("a", "o"));

//з) Преобразуйте строку к верхнему регистру.

        System.out.println("Задание №8 " + s1.toLowerCase());

//и) Преобразуйте строку к нижнему регистру.

        System.out.println("Задание №9 " + s1.toUpperCase());


//к) Вырезать строку Java c помощью метода String.substring().

        System.out.println("Задание №10 " + s1.substring(7, 11));
    }

    private static void method1(String x) {    //#1
        System.out.println("Задание №1 " + x);

    }
}
