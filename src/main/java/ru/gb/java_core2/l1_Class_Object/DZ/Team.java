package ru.gb.java_core2.l1_Class_Object.DZ;


public class Team {

    private final String name;
    private final int power;
    //private Team[] team;
    //private int teamCount;


    public Team(String name) {
        this.name = name;
        power = (int) (Math.random() * 100);
    }
    /*
    public Team(int teamCount) {
        for (int i = 0; i < teamCount; i++) {
            team[i] = new Team();
        }
    }
    */

    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }
    /*
    public Team[] getTeam() {
        return team;
    }
    */

    public void TeamInfo(Team[] arr, int length) {
        System.out.println("Our warriors:");

        for (int i = 0; i < length; i++) {
            System.out.printf("Name: %s, Power: %d\n", arr[i].getName(), arr[i].getPower());
        }
        System.out.println("___________________________________________________________________________________\n");
    }






}
