package ru.geekbrains.Level2.Lesson2;


public class Main {

    public static void main(String[] args) {

        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

        try {
            method(array);
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }

    }

    public static void method(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) throw new MyArraySizeException("Массив размером отличный от 4");

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                try {
                    sum = sum + Integer.parseInt(array[i][j]);

                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }

            }

        }
        System.out.println(sum);
    }
}

//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.

//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.

//3. В методе main() вызвать полученный метод, обработать возможные исключения
// MySizeArrayException и MyArrayDataException, и вывести результат расчета.