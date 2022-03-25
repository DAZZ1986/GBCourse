package ru.gb.java_core1.l3_practice;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class ClassWork {

    //Оформление кода
        /*
        Именование:
        классы - OurSomeLongClass
        переменные, методы - int someVariable = 5;
        константы - public static final String SOME_CONSTANT_VALUE = "some";
         */
    public static void main(String[] args){

        System.out.println("Lesson 3");
/*
        int[] arr = createArrayWithRandomValues(15);
        System.out.println(Arrays.toString(arr));

        Random random = new Random();
        System.out.println(random.nextInt(100));

        int[] array = createArrayWithRandomValues(15, -100, 100);
        System.out.println(Arrays.toString(array));

        double randomDouble = random.nextDouble() * 100;
        System.out.println(randomDouble);

        System.out.println(Math.random());
*/
/*
        //Scanner
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your word: ");
        //scanner.useDelimiter("__");
        //String word = scanner.next();
        //String word = scanner.nextLine();
        //System.out.printf("Your word is: %s\n", word);

        //int a = scanner.nextInt();
        //System.out.println(a);

        //double d = scanner.nextDouble();
        //System.out.println(d);


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите диапазон значений через пробел >>> ");

        int low = scanner1.nextInt();
        int high = scanner1.nextInt();

        int[] arr = createArrayWithRandomValues(15, low, high+1);
        System.out.println("Задайте число в этом массиве >>> ");
        int guess = scanner1.nextInt();
        int result = search(arr, guess);
        if(result < 0)
            System.out.println("Не угадал");
        else
            System.out.println("Угадал");

        System.out.println(Arrays.toString(arr));
*/

        //Многомерные массивы
        int[][] arr = new int[3][3];
        arr[1][1] = 5;
        arr[2][2] = 8;
        //print2dArray(arr);
        //System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = new int[3][];
        arr2[0] = new int[10];
        arr2[1] = new int[5];
        arr2[2] = new int[14];

        int[][] arr3 = {
                {1,2,3,4},
                {1,2},
                {1,2,3,423,3524,234},
                {1,2,3,4}
        };
        print2dArray(arr3);


    }





    public static void print2dArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArrayWithRandomValues(int length) {
        int[] arr = new int[length];
        Random random = new Random();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        return arr;
    }

    public static int[] createArrayWithRandomValues(int length, int lowBound, int highBound) {
        int range = highBound - lowBound;

        int[] arr = new int[length];
        Random random = new Random();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(range) + lowBound;
        }

        return arr;
    }

    public static int search(int[] arr, int value) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }




}
