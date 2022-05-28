package ru.gb.java_core2.l4.DZ;

public class Main {

    public static void main(String[] args) {
        doPhoneBook();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Shum","89670049109");
        phoneBook.addElementPhoneBook("Shum","89670049110");
        phoneBook.addElementPhoneBook("Shum","89670049111");

        phoneBook.addElementPhoneBook("Art","888888");
        phoneBook.addElementPhoneBook("Art","888888");
        phoneBook.addElementPhoneBook("Art","888888   ");
        phoneBook.addElementPhoneBook("Art","888  88 8 ");
        phoneBook.addElementPhoneBook("Art","8  8  8 888     ");

        System.out.println("Shum: " + phoneBook.getPhonesByName("Shum"));
        System.out.println("Art: " + phoneBook.getPhonesByName("Art"));
        System.out.println("Alex: " + phoneBook.getPhonesByName("Alex"));
        System.out.println("Nikto: " + phoneBook.getPhonesByName("Nikto"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Mama";
        strings[1] = "Papa";
        strings[2] = "Puma";
        strings[3] = "Irbis";
        strings[4] = "Mama";
        strings[5] = "Papa";
        strings[6] = "Kot";
        strings[7] = "Sobaka";
        strings[8] = "Dochka";
        strings[9] = "Sobaka";
        return strings;
    }

}
