package ru.gb.java_core1.l6_OOP_prodvinutoe;

import ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Animal;
import ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Bird;
import ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Cat;
import ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Dog;
import ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Parrot;
import ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Snake;


public class ClassWork {

    public static void main(String[] args) {
        //Abstruct
        //Абстрактный метод может не иметь реализации, но он может существовать только в абстрактном классе.
        //В абстрактном классе могут быть не абстрактные методы. Если класс не абстрактный то метод обязательно нужно переопределить.
        //Нельзя создавать объекты абстрактного класса.

        //Static
        //Статика она не наследуется, тк она принадлежит классу, но методы и поля можно вызвать из родительских классов. !?

        //final в переменной значит что переменную нельзя перезаписать. В java нет const, а есть final.
        //final в методе значит что метод нельзя переопределить.
        //final в классе мы запрещаем наследовать.


        ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Animal[] animals = {
                new ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Cat("Barsik", "white"),
                new ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Bird("Chizhik", "yellow"),
                new ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Dog("Bobik", "black"),
                new ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Snake("Kaa", "green"),
                new ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Parrot("Kesha", "blue"),
//                new Animal("JJJJ", "xkfdmv")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].walk();
            animals[i].voice();

            if (animals[i] instanceof ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Bird) {
                ((ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Bird) animals[i]).fly();
            }

            if (animals[i] instanceof ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Parrot) {
                ((ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Parrot) animals[i]).speak();
            }

//            if (i == 0) {
//                Bird b = (Bird) animals[i];
//                b.fly();
//            }
        }

        ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Snake snake = new ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Snake("xfbb", "xfdfgvgfd");
        snake.voice();
        snake.walk();
        snake.walkAsParent();

        System.out.println(ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Animal.STATIC_FIELD);
        System.out.println(ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Cat.STATIC_FIELD);
        ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Animal.doStatic();
        ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Cat.doStatic();

        ru.gb.java_core1.l6_OOP_prodvinutoe.zoo.Dog.doStatic();
    }

}
