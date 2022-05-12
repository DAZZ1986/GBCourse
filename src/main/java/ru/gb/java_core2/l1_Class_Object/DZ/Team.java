package ru.gb.java_core2.l1_Class_Object.DZ;

import java.util.Arrays;

public class Team {

    private final String name;
    private int power;
    private int difficulty;


    public Team(String name) {
        this.name = name;
        power = (int) (Math.random() * 100);
    }


    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }



    public void passCourseTeamPlayers(Team[] tArr, Course[] cArr) {
        boolean flag = true;

        for (int i = 0; i < tArr.length; i++) {
            flag = true;
            for (int j = 0; j < cArr.length; j++) {
                if(tArr[i].power > cArr[j].getDifficulty())
                {
                    System.out.printf("Player %s PASSED course. Power: %d - Course: %d\n", tArr[i].getName(), tArr[i].power, cArr[j].getDifficulty());
                }
                else
                {
                    flag = false;
                    System.out.printf("Player %s DO NOT passed the course. Power: %d - Course: %d\n", tArr[i].getName(), tArr[i].power, cArr[j].getDifficulty());
                }
            }
            if(flag)
                System.out.printf("Player %s PASSED ALL course.\n", tArr[i].getName());
            else
                System.out.printf("Player %s DO NOT passed ALL course.\n", tArr[i].getName());

            System.out.println("_____________________\n");
        }
    }

    public void allTeamInfo(Team[] arr, int length) {

        for (int i = 0; i < length; i++) {
            System.out.printf("Name: %s, Power: %d\n", arr[i].getName(), arr[i].getPower());
        }

    }






}
