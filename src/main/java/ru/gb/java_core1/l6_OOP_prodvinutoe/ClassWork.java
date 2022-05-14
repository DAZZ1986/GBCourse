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


        Animal[] animals = {
                new Cat("Barsik", "white"),
                new Bird("Chizhik", "yellow"),
                new Dog("Bobik", "black"),
                new Snake("Kaa", "green"),
                new Parrot("Kesha", "blue"),
//                new Animal("JJJJ", "xkfdmv")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].walk();
            animals[i].voice();

            if (animals[i] instanceof Bird) {
                ((Bird) animals[i]).fly();
            }

            if (animals[i] instanceof Parrot) {
                ((Parrot) animals[i]).speak();
            }

//            if (i == 0) {
//                Bird b = (Bird) animals[i];
//                b.fly();
//            }
        }

        Snake snake = new Snake("xfbb", "xfdfgvgfd");
        snake.voice();
        snake.walk();
        snake.walkAsParent();

        System.out.println(Animal.STATIC_FIELD);
        System.out.println(Cat.STATIC_FIELD);
        Animal.doStatic();
        Cat.doStatic();

        Dog.doStatic();
    }

}
