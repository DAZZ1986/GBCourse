package ru.gb.java_core1.l1_intro;

public class HelloWorld {


    public static void main(String[] args) {

        //1
        int a = 5;
        int b = 2;
        int c = a + b;  //тут был не указан тип переменной
        System.out.println(c);

        //2
        char c1 = 'H';  //чар вмещает только 1 символ, а не массив символов
        System.out.println(c1);

        //3
        String hw = "Hello, World!";    //тут были не корректные ковычки
        System.out.println(hw);

        //4
        String q = "Hello";     //тут стояли одинарные ковычки, а должны быть двойные
        System.out.println(q);  //тут нехватало закрывающей точки с запятой ;

        //5
        int a2 = 10;
        int b2 = 20;
        int c2 = a2 * 2 - b2 + 5;
        System.out.println("c = " + c2); //тут не корректные ковычки

        //6
        int a3 = 20;
        String b3 = "myNumber = ";   //тут не корректные ковычки
        a3 *= a3;
        System.out.println(b3 + a3);



    }


}
