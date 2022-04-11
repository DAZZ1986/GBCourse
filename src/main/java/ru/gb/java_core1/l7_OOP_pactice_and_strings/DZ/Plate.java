package ru.gb.java_core1.l7_OOP_pactice_and_strings.DZ;

public class Plate {
    private int foodAmount;







    public void putFood(int amount) {
        foodAmount += amount;
    }
    public void decreaseFood(int amount) {
        foodAmount -= amount;
    }


    public int getFoodAmount() {
        System.out.println("Кол-вы еды в тарелке " + foodAmount);
        return foodAmount;
    }

}
