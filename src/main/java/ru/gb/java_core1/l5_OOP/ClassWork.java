package ru.gb.java_core1.l5_OOP;

public class ClassWork {

    public static void main(String[] args) {
        // OOP
/*
        Cat cat = new Cat();
        cat.name = "Mursik";
        cat.age = 2;
        cat.color = "red";

        Cat cat2 = new Cat();
        cat2.name = "Barsik";
        cat2.age = 3;
        cat2.color = "black";

        printCat(cat);
        printCat(cat2);

        cat.age = 999;



        cat.run();
        cat.run(1000);
        cat.voice();
        cat2.run();
        cat2.run(2000);
        cat2.voice();

        System.out.println("____________________");
        System.out.println(cat2);
*/

        System.out.println("____________________");
        Cat cat3 = new Cat("Vaska", "Grey", 1);

        System.out.println(cat3);
        cat3.run();
        cat3.run(3000);
        cat3.voice();

        cat3.setName("Murka");
        System.out.println(cat3);


        //this это ссылка на текущий объект. к this можно обратиться к текущему объекту, не статическому вроде?????



        // Static and non static
        Cat.doStatic();
        System.out.println(Cat.type);



        cat3.nonStatic();


        cat3.doStatic();
        System.out.println(cat3.type);


        Cat cat4 = new Cat("Tom", "Grey", 1);

        System.out.println(cat4.type);


        // Создание и хранение объектов в памяти
        //Объекты создаются с помощью оператора new, инициируют выделение памяти для объекта справа, создается в куче(heap), а ссылка на объект будет хранится в стеке.

    }











    /*
    private static void printCat(Cat cat) {
        System.out.printf("Cat: name=%s, color=%s, age=%s\n", cat.name, cat.color, cat.age);
    }
    */


}
