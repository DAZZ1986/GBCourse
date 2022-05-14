package ru.gb.java_core1.l2_base_expressions.DZ;

public class HomeWork {


    public static void main(String[] args){
        //Task 1
        boolean res = CheckNumber(7,5);
        System.out.println(res);
        //Task 2
        CheckPos(0);
        //Task 3
        boolean res2 = CheckPos2(-1);
        System.out.println(res2);
        //Task 4
        PrintString("Dazz", 5);
        //Task 5
        boolean res3 = YearVesocos(400);
        System.out.println(res3);

    



    }






    public static boolean CheckNumber(int a, int b){
        int c = a + b;
        if(c >= 10 && c <= 20)
            return true;
        else
            return false;
    }

    public static void CheckPos(int a){
        if(a >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }

    public static boolean CheckPos2(int a){
        if(a >= 0)
            return true;
        else
            return false;
    }

    public static void PrintString(String a, int b){
        for(int i = b; i >= 1; i--)
        {
            System.out.println(a);
        }
    }

    public static boolean YearVesocos(int a){

        if(a % 4 == 0)
        {
            if(a % 400 == 0)
            {
                return true;
            }
            else if (a % 100 == 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }

    }


}
