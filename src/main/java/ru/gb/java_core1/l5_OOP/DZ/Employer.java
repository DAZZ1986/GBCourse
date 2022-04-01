package ru.gb.java_core1.l5_OOP.DZ;

public class Employer extends Person {

    String name;
    String surName;
    String email;
    double phone;
    int salary;
    int age;


    Employer(String name, String surName, String email, double phone, int salary, int age) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }



    public void infoObject(){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surName);
        System.out.println("Имэйл: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

}
