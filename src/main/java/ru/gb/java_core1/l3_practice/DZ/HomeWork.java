package ru.gb.java_core1.l3_practice.DZ;

import java.util.Arrays;

public class HomeWork {
    public static int startCompare = 0;
    public static int endCompare = 0;

    public static void main(String[] args) {
/*
        //Task 1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 1)
                arr1[i] = 0;
            else
                arr1[i] = 1;
        }
        System.out.println(Arrays.toString(arr1));
*/   
/*
        //Task 2
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i+1;
        }
        System.out.println(Arrays.toString(arr2));
*/
/*
        //Task 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6)
                arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));
*/
/*
        //Task 4
        int[][] arr4 = new int[3][3];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if( i == j)
                    arr4[i][j] = 1;
            }
        }
        print2dArray(arr4);

        int jMax = arr4.length - 1;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = arr4.length; j > 0; j--) {

                arr4[i][jMax] = 1;

                jMax--;
                i++;
            }
            break;
        }
        print2dArray(arr4);
*/
/*
        //Task 6
        int[] arr6 = {-1, 4, 45, 0, 21, 22};
        int max = arr6[0];
        int min = arr6[0];
        for (int i = 0; i < arr6.length; i++) {

            if(arr6[i] > max)
                max = arr6[i];

            if(arr6[i] < min)
                min = arr6[i];

            // max = arr6[j] > max ? max = arr6[j] : ????????; // не смог сделать через тернарный,тк не смог заглушить второе условие

        }
        System.out.println(max);
        System.out.println(min);
*/
/*
        //Task 7
        int[] arr7True = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr8True = {1, 1, 1, 2, 1};
        int[] arr9False = {2, 2, 2, 1, 2, 2, 10, 2};
        int[] arr10False = {2, 2, 2};
        int[] arr11False = {2, 2, 2, 1};

        System.out.println(checkBalance(arr7True));
        System.out.println(checkBalance(arr8True));
        System.out.println(checkBalance(arr9False));
        System.out.println(checkBalance(arr10False));
        System.out.println(checkBalance(arr11False));
*/
/*
        //Task 8    Не смог сделать, полурешение найдено тут https://www.youtube.com/watch?v=GAMCj0_lTFs
        int[] arrIshod = {1,2,3,4,5};
        int n1 = arrIshod.length;

        int[] arrResult;
        arrResult = moveArray(arrIshod, n1);
        System.out.println(Arrays.toString(arrResult));
*/
    }






    //Task 8
    public static int[] moveArray(int[] arr, int n) {
        int t = arr[arr.length-1];

        for (int i = n-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }

        arr[0] = t;
        return arr;
    }


    //Task 7 - складываем от краев к центру и кто меньше тот и двигается к центру складывая, далее проверка кто больше, далее снова шаг делает тот
    //кто меньше.
    public static boolean checkBalance(int[] arr) {
        startCompare = arr[0];
        endCompare = arr[arr.length-1];

        for (int s = 0; s < arr.length; s++) {
            for (int e = arr.length-1; e > 0; ) {
                for (int i = 0; i < arr.length; i++) {
                    //тут конечно мне кажется я сделал убого, буду рад совету, тк мне кажется эта часть упадет когда нибдь
                    if(s == e || s+1==e || e-1==s)  //как сделать логичную остановку, тк на сколько я понял равны они быть не могут, а я хотел их остановить при их равенстве, но если они будут равны мы сделаем лишнюю итерацию сложения
                        break;

                    if(startCompare > endCompare) {
                        endCompare += arr[e-1];
                        e--;
                    }
                    else
                    {
                        startCompare += arr[s+1];
                        s++;
                    }
                }

                if(startCompare == endCompare) {
                    return true;
                }
                else
                    return false;
            }
        }
        return false;
    }


    //Task 4
    public static void print2dArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }

}
