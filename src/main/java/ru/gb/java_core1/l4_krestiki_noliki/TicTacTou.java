package ru.gb.java_core1.l4_krestiki_noliki;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TicTacTou {

    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = '.';

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static char[][] field;
    private static char dotHuman;
    private static char dotAi;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;
    private static int winLength;

/*
СХЕМА РАБОТЫ ПРОГРАММЫ:
main(String[] args)
startNewGame();
chooseDot();
playRound();
initField(sizeX, sizeY);
printField();

humanFirst();	//цикл игры тут если игрок выбрал "Х", если нет то тут aiFirst()

humanTurn();	//ход игрока
isCellValid(int y, int x);  //проверяет возможность установки фишки в указанную ячейку
printField();	//печать поля
gameCheck(dotHuman);	//проверка победы игрока или аи через вызов метода checkWin()
checkWin(dot) && dot == dotHuman;  //проверка победы игрока
checkWin(dot) && dot == dotAi;	   //проверка победы аи
checkDraw();	//проверка - заполненна ли карта, если да, то ничья

aiTurn();
isCellValid(int y, int x);
printField();
gameCheck(dotAi);
checkWin(dot) && dot == dotHuman;
checkWin(dot) && dot == dotAi;
checkDraw();


humanTurn();    //ход игрока итд......
...
aiTurn(); ...

 */


    public static void main(String[] args) {
        startNewGame();
    }


    private static void startNewGame() {
        while (true){
            chooseDot();
            playRound();

            System.out.printf("SCORE:     HUMAN     AI\n" +
                    "             %d       %d\n", scoreHuman, scoreAi);

            System.out.print("Want to play again ? (Y or N) >>> ");
            if(!scanner.next().toLowerCase(Locale.ROOT).equals("y")) {
                System.out.println("BYE");
                break;
            }
        }
    }

    //выбор Х или 0
    private static void chooseDot() {
        System.out.print("Type 'X' to play with X and for '0' type anything >>> ");

        if(scanner.next().toLowerCase(Locale.ROOT).equals("x")) {
            dotHuman = DOT_X;
            dotAi = DOT_0;
        } else {
            dotHuman = DOT_0;
            dotAi = DOT_X;
        }
    }

    private static void playRound() {
        System.out.printf("Round %d start\n", ++roundCounter);
        int sizeX = -0;
        int sizeY;
        boolean check = true;

        while(check) {
            try {
                check = false; //ставим false, что бы не вводить больше данные
                System.out.println("Введите размер поля (нечетное число): ");
                sizeX = scanner.nextInt();

                if (sizeX % 2 == 0) {
                    check = true;
                    System.out.println("Неверное значение - введите нечетное число повторно!");
                }
            } catch(Exception ex) {
                System.out.println("Неверное значение - введите нечетное число повторно!");
                check = true; //если вышло исключение, ставим обратно true, что бы опять вводить данные
            }
        }
        sizeY = sizeX;
        initField(sizeX, sizeY);
        //initField(3, 3);

        printField();

        if(dotHuman == DOT_X) {     //тут ходит первый тот кто выбрал "Х"
            humanFirst();
        } else {
            aiFirst();
        }
    }

    private static void humanFirst() {
        while(true) {
            humanTurn();
            printField();
            if (gameCheck(dotHuman)) {
                break;
            }
            aiTurn();
            printField();
            if (gameCheck(dotAi)) {
                break;
            }
        }
    }
    private static void aiFirst() {
        while(true) {
            aiTurn();
            printField();
            if (gameCheck(dotAi)) {
                break;
            }
            humanTurn();
            printField();
            if (gameCheck(dotHuman)) {
                break;
            }
        }
    }

    //проверка победы
    private static boolean gameCheck(char dot) {
        if(checkWin(dot) && dot == dotHuman) {
            System.out.println("Human win!");
            scoreHuman++;
            return true;
        } else if (checkWin(dot) && dot == dotAi) {
            System.out.println("AI win!");
            scoreAi++;
            return true;
        }
        return checkDraw();
    }




    private static void aiTurn() {
        int x;
        int y;

        //метод определения шансов на победу аи, если тут false, то проверяем на блок победы игрока и если там false, то аи ходит рандомно
        checkMyChances();
        blockWinHuman();

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellValid(y, x));   //коммент ниже по данному коду...

        field[y][x] = dotAi;    //коммент ниже по данному коду...
    }
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Please enter coordinates x & y >>>> ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));   //тут мы будем играть пока с метода isCellValid будет возвращаться true, и тут мы его конвертим
                                        //в false, тк как только while() увидит true цикл прервется.
        field[y][x] = dotHuman;   //устанавливаем фишку игрока после проверки на возможность установки в isCellValid(y, x)
    }


    public static boolean checkMyChances() {

        return false;
    }

    public static boolean blockWinHuman() {
        return false;
    }

    private static boolean checkWin(char dot) {
        boolean flag = false;
        int counterX = 0;
        int counterY = 0;
        int counterD = 0;

        //hor
        for (int y = 0; y < fieldSizeY; y++) {
            counterX=0;
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == dot) {
                    flag = true;
                    counterX++;
                    if(counterX == fieldSizeX)
                        break;
                }
                else {
                    flag = false;
                }
            }
            if(counterX == fieldSizeX)
                break;
        }
        if(counterX == fieldSizeX)
            return flag;

        //ver
        for (int y = 0; y < fieldSizeY; y++) {
            counterY=0;
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[x][y] == dot) {
                    flag = true;
                    counterY++;
                    if(counterY == fieldSizeY)
                        break;
                }
                else {
                    flag = false;
                }
            }
            if(counterY == fieldSizeY)
                break;
        }
        if(counterY == fieldSizeY)
            return flag;

        //diag слева - направо
        for (int y = 0; y < fieldSizeY; y++) {
            counterD=0;
            for (int x = 0; x < fieldSizeX; x++) {
                if (x == y && field[x][y] == dot) {
                    flag = true;
                    counterD++;
                    y++;
                    if(counterD == fieldSizeY)
                        break;
                }
                else {
                    flag = false;
                }
            }
            if(counterD == fieldSizeY)
                break;
        }
        if(counterD == fieldSizeY)
            return flag;
        counterD=0;

        //diag 2 справа - налево
        for (int x = fieldSizeX-1; x > 0; ) {
            //counterD=0;
            for (int y = 0; y < fieldSizeY; y++) {
                if (field[y][x]==dot) {
                    flag = true;
                    counterD++;
                    if(counterD == fieldSizeY)
                        break;
                }
                else {
                    flag = false;
                }
                x--;
            }
            if(counterD == fieldSizeY)
                break;
        }
        if(counterD == fieldSizeY)
            return flag;

        return false;
    }

    //проверка - заполненна ли карта, если да, то ничья
    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if(field[y][x] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        System.out.println("Nichiy");
        return true;
    }

    //проверяет возможность установки фишки в указанную ячейку
    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY && field[y][x] == DOT_EMPTY;
    }

    //инициализация карты точками
    private static void initField(int sizeX, int sizeY) {
        fieldSizeY = sizeY;
        fieldSizeX = sizeX;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.println("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }

        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");

            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i < fieldSizeX + 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }


}
