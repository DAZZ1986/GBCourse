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

        System.out.println("_______________________________________________________");
        Cat cat3 = new Cat("Vaska", "Grey", 1);

        System.out.println(cat3);
        cat3.run();
        cat3.run(3000);
        cat3.voice();

        cat3.setName("Murka");
        System.out.println(cat3);


        System.out.println("_______________________________________________________");


        // Static and non static    (время 1:24)
        System.out.println("Static and non static");

        Cat.doStatic();                 //этот статический метод принадлежит самому классу Cat, поэтому мы его смогли вызвать через имя класса
        System.out.println(Cat.type);   //это статическое поле принадлежит самому классу Cat, поэтому мы его смогли вызвать через имя класса

        cat3.nonStatic();

        System.out.println("_ _ _ _ _ _ _");

        cat3.doStatic();               //тут айдия нам подчеркивает что мы обращаемся к статическим членам класса
        System.out.println(cat3.type); //тут айдия нам подчеркивает что мы обращаемся к статическим членам класса

        System.out.println("_ _ _ _ _ _ _");

        Cat cat4 = new Cat("Tom", "Grey", 1);
        System.out.println(cat4.type);
        cat4.type = "ADSDAWEQ";         //тут мы поле type перезаписали не у кота4, а поменяли его в классе, тк оно принадлежит классу, а не объекту и
                                        //как следствие оно общее для все объектов котов.
        System.out.println(cat4.type);  //тут мы как раз это и наблюдаем что оно общее
        System.out.println(cat3.type);  //тут мы как раз это и наблюдаем что оно общее
        //Нежелательно вызывать из объектов статические члены класса. К статике принято обращаться через имя класса потому что если это делать через
        //объект айдия даже не будет подтягивать автозаполнения, имена полей, методов.



        System.out.println("_______________________________________________________");



        // Создание и хранение объектов в памяти
        //Объекты создаются с помощью оператора new, инициируют выделение памяти для объекта справа, создается в куче(heap),
        //а ссылка на объект будет хранится в стеке(ссылка на объект хранится в его имени).


        //this это ссылка на текущий объект. к this можно обращаться из не статических методов, конструктор это тоже не статич. метод.

    }











    /*
    private static void printCat(Cat cat) {
        System.out.printf("Cat: name=%s, color=%s, age=%s\n", cat.name, cat.color, cat.age);
    }
    */


}
