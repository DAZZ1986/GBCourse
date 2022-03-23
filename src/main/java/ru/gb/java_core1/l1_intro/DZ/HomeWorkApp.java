package ru.gb.java_core1.l1_intro.DZ;

public class HomeWorkApp {

    public static void main(String[] args) {


        // Task 2
        printThreeWords();

        // Task 3
        checkSumSign();

        // Task 4
        printColor();
        printColor2();

        // Task 5
        compareNumbers();

    }


  


    public  static void printThreeWords()
    {
        String[] arr = new String[] {"Orange", "Banana", "Apple"};

        for(int i=0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }


    public static void checkSumSign(){
            int a = 5;
            int b = 10;

            if (a + b >= 0)
                System.out.println("Сумма положительная");
            else
                System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
            int value = -12;

            if(value <= 0)
                System.out.println("Красный");
            else if(value > 0 && value <= 100)
                System.out.println("Желтый");
            else
                System.out.println("Зеленый");
    }

    public static void printColor2() {
        System.out.println("printColor2");
        int value = 120;
        System.out.println(value <= 0 ? "Red" : "Green");

        System.out.println(value <= 0 ? "Red" : value <= 100 ? "Yellow" : "Green");
    }


    public static void compareNumbers(){
            int a = 1;
            int b = 7;

        System.out.println(a >= b ? "a >= b" : "a < b");
/*
        if(a >= b)
                System.out.println("a >= b");
            else
                System.out.println("a < b");
 */
    }


}
