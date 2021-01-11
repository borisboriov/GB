package ru.geekbrains.lesson4;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

   private static final int SIZE =3;
   private static final int DOTS_TO_WIN = 4;
   private static final char[][] map = new char[SIZE][SIZE];

   private static final char DOT_EMPTY = '•';
   private static final char DOT_X = 'X';
   private static final char DOT_O = 'O';

   public static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        initializeGame();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if  (checkEndGame(DOT_X)){
                break;
            }

            computerTurn();
            printMap();
            if (checkEndGame(DOT_O)) {
                break;
            }
        }

    }

    private static boolean checkEndGame(char symbol) {
        if (checkWin(symbol)){
            System.out.println(isHumanTurn(symbol) ? "Человек победил!" : "Компютер победил");
            return true;
        }
        if (isMapFull()){
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    private static boolean isMapFull(){
        for (char[] rows : map) {
            for (char cellValue : rows) {
                if(cellValue == DOT_EMPTY ) {
                    return false;
                }

            }
        }
        return true;
    }


    private static boolean checkWin(char symbol) {
        if (checkRowsAndCols(symbol)) return true;
        return checkDiagonals(symbol);
    }

    private static boolean checkDiagonals(char symbol) {
        int x = 0;
        int z = 0;
        for (int i = 0; i < SIZE; i++) {
            x = (map[i][i] == symbol) ? x + 1 : 0;
            z = (map[i][map.length - 1 - i] == symbol) ? z + 1 : 0;
            if (x == DOTS_TO_WIN || z == DOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }


    private static boolean checkRowsAndCols(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int x = 0;
            int z = 0;
            for (int j = 0; j < SIZE; j++) {
                x = (map[i][j] == symbol) ? x + 1 : 0;
                z = (map[j][i] == symbol) ? z + 1 : 0;
                if (x == DOTS_TO_WIN || z == DOTS_TO_WIN){
                    return true;
                }

            }

        }
        return false;


    }
    
    
    
        
        
    


    private static void humanTurn() {
        int rowIndex = -1;
        int colIndex = -1;
        do {
            System.out.print("ВВедите номер строки: ");
            if (!SCANNER.hasNextInt()){
                SCANNER.nextLine();
                System.out.println("Введите число");
                continue;
            }
            rowIndex = SCANNER.nextInt() - 1;

            System.out.print("ВВедите номер столба: ");
            if (!SCANNER.hasNextInt()){
                SCANNER.nextLine();
                System.out.println("Введите число");
                continue;
            }
            colIndex = SCANNER.nextInt() - 1;
        } while (!isCellValid(rowIndex, colIndex, DOT_X));

        map[rowIndex][colIndex] = DOT_X;
    }

    private static void computerTurn() {
        int rowIndex = -1;
        int colIndex = -1;
        Random rand = new Random();
        do {
             rowIndex = rand.nextInt(SIZE);
             colIndex = rand.nextInt(SIZE);
        } while (!isCellValid(rowIndex, colIndex, DOT_O));

        map[rowIndex][colIndex] = DOT_O;
    }

    private static boolean isCellValid(int rowIndex, int colIndex, char symbol) {
        if (!isArrayIndexValid(rowIndex) || !isArrayIndexValid(colIndex)) {
            System.out.println("Идексы строки и колонки должны быть в диапозоне от 0 до " + SIZE);
            return false;
            }

        if (map[rowIndex][colIndex] != DOT_EMPTY){
            if (isHumanTurn(symbol)){
                System.out.println("Данная ячейка уже занята!");
            }
            return false;
            }
        return true;
    }

    private static boolean isHumanTurn(char symbol) {
        return symbol == DOT_X;
    }

    private static boolean isArrayIndexValid(int index) {
        return index >= 0 && index < SIZE;
    }

    private static void printMap() {
        printHeader();
        printMapState();
        System.out.println();
    }

    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            System.out.print((rowIndex + 1) + " ");
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                System.out.print(map[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initializeGame() {

        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                map[rowIndex][colIndex] = DOT_EMPTY;

            }

        }
    }

}






    //   {
    //           //check rows
    //           if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
    //           if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
    //           if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

    //           //check cols
    //           if (map[0][0]== symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
    //           if (map[0][1]== symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
    //           if (map[0][2]== symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

    //           //check diagonals   в дз исправить все на цикл все три проверки в лекции 2:01 есть задание
    //           if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
    //           if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

    //           return false;
    //           }