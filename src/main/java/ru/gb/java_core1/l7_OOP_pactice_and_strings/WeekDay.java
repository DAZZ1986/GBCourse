package ru.gb.java_core1.l7_OOP_pactice_and_strings;

public enum WeekDay {
    MONDAY(1, "Понедельник"),
    TUESDAY(2, "Вторник"),
    WEDNESDAY(3, "Среда"),
    THURSDAY(4, "Четверг"),
    FRIDAY(5, "Пятница"),
    SATURDAY(6, "Суббота"),
    SUNDAY(7, "Воскресенье");

    private int dayNumber;
    private String russianTitle;

    WeekDay(int dayNumber, String russianTitle) {
        this.dayNumber = dayNumber;
        this.russianTitle = russianTitle;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String getRussianTitle() {
        return russianTitle;
    }
}
