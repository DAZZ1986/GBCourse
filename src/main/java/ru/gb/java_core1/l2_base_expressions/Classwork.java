package ru.gb.java_core1.l2_base_expressions;

public class Classwork {

    public static void main(String[] args)
    {
        String s = "Number a = " + 10 + " num b = " + 10;
        System.out.println(s);


        int a = 10;
        int b = 14;
        String word1 = "Number";
        String word2 = "num";
        System.out.printf("%s a = %d, %s b = %d\n", word1, a, word2, b);

        String formatted = String.format("%s a = %d, %s b = %d\n", word1, a, word2, b);
        System.out.println(formatted);

        /*
        * %s - строка
        * %d - целое число
        * %f - число с плавающей точкой
        * %b - boolean
        * %c - character
        */
        //System.out.println("Floating = %.5f", 10);

        //vendingIf(3);
        vendingSwitch(2);
        //vendingSwitchModern(2);



        //Циклы
        int c = 0;

        while(c < 20) {
            System.out.print(c++ + " ");
        }
        System.out.println(" ");


        do {

            System.out.println(c++ + " do while");

        } while (c < 0);



        int c1 = 0;
        while(true) {

            c1++;

            if(c1 % 2 == 0)
                continue;

            if(c1 == 21)
                break;

        }



        for(int i22 = 0, a22 = 10, b22 = 20; i22 < 10 && a22 > 0 && b22 < 100; i22++, a22--, b22+=10) {
            System.out.printf("a = %d, b = %d, i = %d", a22, b22, i22);
        }

        int i33 = 0;
        for (;;){
            System.out.println(i33++);
            if(i33 == 20){
                break;
            }
        }



        //пред и пост инкременты
        int c2 = 0;
        c2++;
        ++c2;
        System.out.println(++c2);
        System.out.println(c2);



        //Массивы
        System.out.println("Массивы");
        int[] arr = new int[20];
        //массив где его элементы увеличиваются на 5 (тоесть на опред. диапазон увеличиваются его эл.)
        int j3 = 20;
        for (int i = 0, j2 = 5; i < 20 && j2 < 1000; i++, j2 += 5) {
            j3 += 25;
            arr[i] = j3 + 5 + j2;
        }
        for (int item : arr) {
            System.out.println(item);
        }

        System.out.println("____________________-");

        //возврат массива из метода
        int[] arr22 = createArray(20,99);

        for (int item : arr22) {
            System.out.println(item);
        }

        System.out.println("____________________-");

        //вывод массива в обратном порядке
        int[] arr4 = {1, 2, 3, 41, 5, 623, 7};
        for(int i = arr4.length-1; i >= 0; i--){
            System.out.println(arr4[i]);
        }







    }



    private static int[] createArray(int length, int value){
        int[] arr = new int[length];

        for(int i = 0; i < length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    /*
    private static void vendingSwitchModern(int choice){
        //java 14+ - не сработает тк у меня стоит java 8
        switch (choice) {
            case 1 -> System.out.println("Ice-cream Switch");
            case 2 ->
                {
                    System.out.println("Chupa-chups Switch");
                    System.out.println("Chupa-chups Switch");
                    System.out.println("Chupa-chups Switch");
                    System.out.println("Chupa-chups Switch");
                }
            case 3 -> System.out.println("Pepsi Switch");
            case 4 -> System.out.println("Snickers Switch");
            default -> System.out.println("ERROR Switch");
        }
    }
    */

    private static void vendingSwitch(int choice){

        switch (choice) {
            case 1:
                System.out.println("Ice-cream Switch");
                break;
            case 2:
                System.out.println("Chupa-chups Switch");
            case 3:
                System.out.println("Pepsi Switch");
                break;
            case 4:
                System.out.println("Snickers Switch");
                break;
            default:
                System.out.println("ERROR Switch");
        }
    }

    private static void vendingIf(int choice){
        if(choice == 1){
            System.out.println("Ice-cream IF");
        } else if (choice == 2) {
            System.out.println("Chupa-chups IF");
        } else if (choice == 3) {
            System.out.println("Pepsi IF");
        } else if (choice == 4) {
            System.out.println("Snickers IF");
        } else  {
            System.out.println("ERROR IF");
        }
    }



}
