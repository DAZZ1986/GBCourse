package ru.gb.java_core1.l6_OOP_prodvinutoe.DZ.zoo;

public class Dog extends Animal {

    private String name;
    private static int dogCounter;


    public Dog(String name) {
        this.name = name;
        dogCounter++;
    }



    public String getName() {
        return name;
    }
    public void getDogCounter() {
        System.out.printf("Собак было создано: %d\n", dogCounter);
    }




    @Override
    public void Run(int length) {
        if(length <= 500) {
            System.out.printf("%s пробежал %d\n", name, length);
        } else {
            System.out.printf("%s столько пробежать не в состоянии!\n");
        }
    }

    @Override
    public void Swim(int length) {
        if(length <= 10) {
            System.out.printf("%s проплыл %d\n", name, length);
        } else {
            System.out.printf("%s столько проплыть не в состоянии!\n", name);
        }
    }

}
