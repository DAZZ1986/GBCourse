package ru.gb.java_core1.l7_OOP_pactice_and_strings.DZ;

public class HomeWork {


    public static void main(String[] args) {

        Cat cat1 = new Cat("Mursik", 100, 40);
        Plate plate1 = new Plate();


        plate1.putFood(500);

        cat1.Eat(plate1);
        plate1.getFoodAmount();
        System.out.println("__________________________________");

        cat1.Eat(plate1);
        plate1.getFoodAmount();
        System.out.println("__________________________________");

        cat1.Eat(plate1);
        plate1.getFoodAmount();

        cat1.getSatietyDuring();
        cat1.getSatietyEnough();
        System.out.println("__________________________________");

        cat1.Eat(plate1);
        plate1.getFoodAmount();

        cat1.getSatietyDuring();
        cat1.getSatietyEnough();
        System.out.println("__________________________________");

        cat1.Eat(plate1);
        plate1.getFoodAmount();
        System.out.println("__________________________________");

        cat1.Eat(plate1);




        System.out.println("__________________________________");
        System.out.println("__________________________________");
        System.out.println("__________________________________");

        int maxAppetite = 100;
        int maxSatietyEnough = 40;

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Stepa", rnd(maxAppetite), rnd(maxSatietyEnough));
        cats[1] = new Cat("Vany", rnd(maxAppetite), rnd(maxSatietyEnough));
        cats[2] = new Cat("Basik", rnd(maxAppetite), rnd(maxSatietyEnough));
        cats[3] = new Cat("Villy", rnd(maxAppetite), rnd(maxSatietyEnough));
        cats[4] = new Cat("Tom", rnd(maxAppetite), rnd(maxSatietyEnough));

        Plate plate2 = new Plate();
        plate2.putFood(100);

        System.out.println("____Коты едят из дной тарелки___");
        for (int i = 0; i < cats.length; i++) {
            cats[i].Eat(plate2);
        }

        System.out.println("______Сытость котов_______");
        for (int i = 0; i < cats.length; i++) {
            cats[i].getSatietyEnough();
        }


    }



    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }
}
