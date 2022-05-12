package ru.gb.java_core2.l1_Class_Object.DZ;

public class HomeWork {


    public static void main(String[] args) {

        //сохздал команду
        Team[] teams = new Team[4];
        teams[0] = new Team("John");
        teams[1] = new Team("Matt");
        teams[2] = new Team("Den");
        teams[3] = new Team("Fill");

        //Создал препятствия
        Course[] course = new Course[teams.length];
        course[0] = new Course();
        course[1] = new Course();
        course[2] = new Course();
        course[3] = new Course();



        //метод вывода информации обо всех членах команды
        System.out.println("Names of our warriors:");
        teams[0].allTeamInfo(teams, teams.length);
        System.out.println("______________________");

        //метод для вывода информации о членах команды, прошедших дистанцию
        teams[0].passCourseTeamPlayers(teams, course);





    }


}
