package ru.gb.java_core2.l1_Class_Object.DZ;

public class Course {

    private final int difficulty;



    public Course() {
        difficulty = (int) (Math.random() * 100);
    }

    public int getDifficulty() {
        return difficulty;
    }



    public void doIt(Team[] teamArr, Course[] courseArr) {
        boolean flag;

        for (int i = 0; i < teamArr.length; i++) {
            flag = true;
            int num = 1;
            for (int j = 0; j < courseArr.length; j++) {
                if(teamArr[i].getPower() > courseArr[j].getDifficulty())
                {
                    System.out.printf("%s PASSED course #%d.            || %s: power = %d vs course difficulty = %d\n", teamArr[i].getName(), num++, teamArr[i].getName(), teamArr[i].getPower(), courseArr[j].getDifficulty());
                }
                else
                {
                    flag = false;
                    System.out.printf("%s DO NOT passed the course #%d. || %s: power = %d vs course difficulty = %d\n", teamArr[i].getName(), num++, teamArr[i].getName(), teamArr[i].getPower(), courseArr[j].getDifficulty());
                }
            }
            if(flag)
                System.out.printf("Player %s PASSED ALL course.\n", teamArr[i].getName());
            else
                System.out.printf("Player %s DO NOT passed ALL course.\n", teamArr[i].getName());

            System.out.println("___________________________________________________________________________________\n");
        }
    }





}
