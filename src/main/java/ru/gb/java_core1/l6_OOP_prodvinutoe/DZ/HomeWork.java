package ru.gb.java_core1.l6_OOP_prodvinutoe.DZ;

import ru.gb.java_core1.l6_OOP_prodvinutoe.DZ.zoo.Animal;
import ru.gb.java_core1.l6_OOP_prodvinutoe.DZ.zoo.Cat;
import ru.gb.java_core1.l6_OOP_prodvinutoe.DZ.zoo.Dog;

import java.util.Scanner;

public class HomeWork {

    //public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

/*
        System.out.print("Enter number: ");
        int input = scanner.nextInt();
        int input2 = input;

        for(int i=0; i < input; i++) {
            System.out.print(input2 + " ");
            input2 += input;
        }
*/

        Dog dog1 = new Dog("Muhtar");
        dog1.Run(500);
        dog1.Swim(5);
        Dog dog2 = new Dog("Reks");
        dog2.Run(500);
        dog2.Swim(5);

        dog1.getDogCounter();
        //Animal.getDogCounter();

        System.out.println("_____________________________________");

        Cat cat1 = new Cat("Mursik");
        cat1.Run(500);
        cat1.Swim(5);
        Cat cat2 = new Cat("Kony");
        cat2.Run(500);
        cat2.Swim(5);

        cat1.getCatCounter();

    }


}
