package ru.gb.java_core2.l5.DZ;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("example.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_example.csv");
    }

}
