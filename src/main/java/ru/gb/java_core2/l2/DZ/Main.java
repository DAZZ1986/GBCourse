package ru.gb.java_core2.l2.DZ;

public class Main {

    public static void main(String[] args) {
        String[][] strings = createArray();
        //strings[2][3]="K";
        ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.setStrings(strings);

        arrayChecker.summ();
    }

    private static String[][] createArray() {
        String[][] array = new String[4][4];
        for (int i = 0; i < array.length; i++,System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf((int)(Math.random() * 10));
                System.out.print(array[i][j] + " ");
            }
        }
        return array;
    }

}
