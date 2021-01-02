package ru.geekbrains.lesson2;

import java.util.Arrays;

public class arr {
    //#1 Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void main(String[] args) {


        int[] arrr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        for (int i = 0; i < arrr.length; i++) {
            int replace = 1;
            int secondReplace = 0;
            if (arrr[i] == 0) {
                arrr[i] = replace;
            } else {
                arrr[i] = secondReplace;
            }

        }
        System.out.println(Arrays.toString(arrr));


    }

//#2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void secondMain(String[] args) {

        int[] secondArr = new int[8];

        for (int i = 0; i < secondArr.length; i++) {
            int z = 3;
            secondArr[i] = i * z;
        }

        System.out.println(Arrays.toString(secondArr));


    }
//#3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void thridMain(String[] args) {

        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < thirdArr.length; i++) {
            if (thirdArr[i] < 6)
            {
                thirdArr[i] = i * 2;
            }
        }
        System.out.println(Arrays.toString(thirdArr));

    }

//#4Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void fourthMain(String[] args) {

    int[][] fifthArr =  new int [2][2];

        for (int i = 0; i < fifthArr.length; i = i + 2)
        {
            fifthArr[i] = new int [1];
        }
        System.out.println(Arrays.toString(fifthArr));
    }


    public static void fifthMain(String[] args) {

        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }



    }




}
