package ru.gb.java_core1.l6_OOP_prodvinutoe.DZ.zoo;

public class Cat extends Animal {

    private String name;
    private static int catCounter;


    public Cat(String name) {
        this.name = name;
        catCounter++;
    }



    public String getName() {
        return name;
    }
    public void getCatCounter() {
        System.out.printf("Котов было создано: %d\n", catCounter);
    }





    @Override
    public void Run(int length) {
        if(length <= 200) {
            System.out.printf("%s пробежал %d\n", name, length);
        } else {
            System.out.printf("%s столько пробежать не в состоянии!\n", name);
        }
    }

    @Override
    public void Swim(int length) {
        System.out.println("Коты плавать не умеют!\n");
    }

}
