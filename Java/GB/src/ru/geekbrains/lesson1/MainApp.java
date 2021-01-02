package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        byte a = 10;
        short b = 1111;
        long c = 234443332L;
        float d = 1.22f;
        double e = 10.255;
        char f = '2';
        boolean j = true;

        math(2.54f, 3.25f, 1f, 5f);
        boolean z = compare(10, 5);
        System.out.println(z);
        plusOrMinus(-5);
        System.out.println(trueOrFalse(3));
        greet("kapusta");
        year(2020);

    }

    public static float math(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        System.out.println(result);
        return 0;
    }

    public static boolean compare(int a, int b) {
        int c = a + b;
        if (c >= 10 || c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static int plusOrMinus(int a) {
        if (a >= 0) {
            System.out.println("число пложительное");
        } else {
            System.out.println("число отрицательно");
        }
        return a;
    }

    public static boolean trueOrFalse(int a) {
        if (a < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void greet(String name) {
        System.out.println("Hi " + name);
    }

    public static void year(int y) {
        if (y % 4 == 0 && y % 100 != 0) {
            System.out.println(y + "год високосный ");
        }
        else if (y % 400 == 0)
        {
            System.out.println(y + "год високосный ");

        }
        else
        {
            System.out.println(y +  "год не високосный ");

        }

    }
}

