package ru.gb.java_core1.l5_OOP;

/*
private - если прописан ручками полям и методам то доступ внутри класса (class only)
private если использован как дефолтный то он с расширением внутри всего пакета (+ доступ в своем пакете(package))
protected - вызов только из классов наследников (inherited)
public - вызов из всего проекта (all)
 */

//Статические поля и методы принадлежат классу, а не статические поля и методы принадлежат именно объектам.

//Не статическое это описание свойств объекта ......

import java.time.Year;

public class Cat {
    public static String type = "CAT";  //статическое поле, значение хранится в классе

    private String name;    //значения полей хранятся в объектах, тк не статик
    private String color;
    private int birthYear;


    private Cat() {
        System.out.println("Cat born");
    }
    public Cat(String color, int age) {
        this();
        this.color = color;
        this.birthYear = Year.now().getValue() - age;
    }
    public Cat(String name, String color, int age) {
        this(color, age);
        this.name = name;
    }





    public static void doStatic() {     //статический метод - эти методы вызываются прямо из класса, а не объектах!
        System.out.println("Static");
    }



    public void nonStatic() {
        System.out.println(type);
        doStatic();
    }



    void run() {
        System.out.printf("%s runs\n", name);
    }
    void run(int length) {
        System.out.printf("%s runs for %d meters\n", name, length);
    }
    void voice() {
        System.out.printf("%s sing\n", name);
    }
    @Override
    public String toString() {
        return String.format("name=%s color=%s age=%s\n", name, color, getAge());
    }




    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    void setName(String name) {
        this.name = name;
    }



}
