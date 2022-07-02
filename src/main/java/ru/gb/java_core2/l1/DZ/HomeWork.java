package ru.gb.java_core2.l1_Class_Object.DZ;

public class HomeWork {


    public static void main(String[] args) {


        //создал команду
        //Team team = new Team(5);
        Team[] teams = new Team[4];
        teams[0] = new Team("John");
        teams[1] = new Team("Matt");
        teams[2] = new Team("Den");
        teams[3] = new Team("Fill");

        //создал препятствия
        Course[] course = new Course[3];
        course[0] = new Course();
        course[1] = new Course();
        course[2] = new Course();


        //метод вывода информации обо всех членах команды
        teams[0].TeamInfo(teams, teams.length);

        //метод для вывода информации о членах команды, прошедших дистанцию
        course[0].doIt(teams, course);





    }


}
