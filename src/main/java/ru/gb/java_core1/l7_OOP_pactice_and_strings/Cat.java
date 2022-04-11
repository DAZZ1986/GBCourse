package ru.gb.java_core1.l7_OOP_pactice_and_strings;

public class Cat {
    private String name;
    private int appetite;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        bowl.decreaseFood(appetite);
        System.out.printf("Cat %s has eaten %d food\n", name, appetite);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
