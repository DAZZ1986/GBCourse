package ru.gb.java_core1.l5_OOP;
/*
private - если прописан ручками полям и методам то доступ внутри класса (class only)
private если использован как дефолтный то он с расширением внутри всего пакета (+ доступ в своем пакете(package))
protected - вызов только из классов наследников (inherited)
public - вызов из всего проекта (all)
 */

//Статические поля и методы принадлежат классу, а не объектам.
//А не статические поля и методы принадлежат именно объектам.
//Тоесть, если представить, что класс это чертеж, а объект это воплощение этого чертежа. В классе есть поля имя, фамилия, возраст, а
//значения этих полей хранятся конкретно в объектах, НО у нас есть некие СТАТИЧЕСКИЕ поля и их значения хранятся в самом классе.
//Статические методы вызываются прямо из класса, а не из объекта.
//Все что в классе не статическое, это описание свойств и поведения объектов, в самом объекте хранятся конкретные значения свойств.
//Статические поля, это просто некие данные, которые хранятся в самом классе, и все объекты знают какого они класса и эти значения
//для них общие. И эти статические методы они вызываются напрямую через класс.

import java.time.Year;

public class Cat {
    public static String type = "CAT";  //СТАТИЧЕСКОЕ поле, значение хранится в классе, это поле принадлежит самому классу Cat

    private String name;    //значения полей хранятся в объектах, тк не статик
    private String color;
    private int birthYear;


    private Cat() {
        System.out.println("Cat born");
    }
    public Cat(String color, int age) {
        this();     //это вызов конструктора по умолчанию(тот что выше)
        this.color = color;
        this.birthYear = Year.now().getValue() - age;
    }
    public Cat(String name, String color, int age) {
        this(color, age);
        this.name = name;
    }



    public static void doStatic() {     //СТАТИЧЕСКИЙ метод - эти методы вызываются прямо из класса, а не из объектах!
        System.out.println("STATIC");
        //run();       //тут ошибка     //тк мы не можем из статического метода вызвать не статический метод, потому, что статический метод
        //принадлежит классу, и класс не знает о существовании своих методов, как то так ХЗ !?!?   Наверное область памяти другая.
    }

    //Статика ничего не знает о текущем объекте потому что она только в класса, поэтому если мы хотим через статику обратиться к каким то свойствам
    //примеру объекта этого же класса то можно сделать статич. метод, нам нужна ссылка на этого кота(ссылка это переменная/имя объекта, в ней хранится
    // ссылка на объект). Из статики нет this, тк статика в классе, а this это в объекте.
    public static void makeSomeCatRun(Cat cat) {
        cat.run();
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
