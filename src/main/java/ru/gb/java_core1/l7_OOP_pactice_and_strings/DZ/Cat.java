package ru.gb.java_core1.l7_OOP_pactice_and_strings.DZ;

public class Cat {

    private String name;
    private int appetite;           //аппетит - по сколько за раз кот ест
    private int satietyDuring = 0;  //сытость текущая
    private int satietyEnough;      //сытость финальная для true


    public Cat(String name, int appetite, int satietyEnough) {
        this.name = name;
        this.appetite = appetite;
        this.satietyEnough = satietyEnough;
    }

    public void Eat(Plate food) {

        if(food.getFoodAmount() >= appetite) {  //проверяем что в тарелке достаточно еды
            if(appetite >= satietyEnough) {     //проверяем что он наестся если начнет есть
                food.decreaseFood(appetite);
                satietyDuring += appetite;
                System.out.printf("%s съел %d еды!\n", name, appetite);
            } else {
                System.out.printf("%s не стал есть, тк он бы все равно не наелся!" , name);
            }
        }
        else {
            System.out.printf("В тарелке недостаточно еды, тк %s хотел съесть %d \n", name, appetite);
        }
    }


    public void getSatietyDuring() {
        System.out.println("Текущая сытость кота " + satietyDuring + " из " + satietyEnough);
    }

    public boolean getSatietyEnough() {
        if(satietyDuring >= satietyEnough) {
            System.out.printf("%s satiety!\n", name);
            return true;
        } else {
            System.out.printf("%s NOT enough satiety!\n", name);
            return false;
        }
    }





}
