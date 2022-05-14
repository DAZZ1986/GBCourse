package ru.gb.java_core1.l5_OOP.DZ;

public class HomeWork {


    public static void main(String[] args) {




        Employer obj1 = new Employer("Ivan", "Sokolov", "ivan@yandex.ru", 877123777, 55000, 45 );

        obj1.infoObject();

        Employer[] employersArray = new Employer[5];
        employersArray[0] = new Employer("Ivan", "Sokolov", "ivan@yandex.ru", 877123777, 55000, 30 );
        employersArray[1] = new Employer("Sergei", "Ivanov", "Sergei@yandex.ru", 877123777, 45000, 45 );
        employersArray[2] = new Employer("Vova", "Popov", "Vova@yandex.ru", 877123777, 25000, 55 );
        employersArray[3] = new Employer("Denis", "Sidorov", "Denis@yandex.ru", 877123777, 15000, 45 );
        employersArray[4] = new Employer("Igor", "Lokov", "Igor@yandex.ru", 877123777, 5000, 35 );

        System.out.println("_________________________");
        System.out.println("Сотрудники старше 40 лет.");
        System.out.println("_________________________");
        for (int i = 0; i < employersArray.length; i++) {
            if(employersArray[i].getAge() > 40 ){
                employersArray[i].infoObject();
            }
        }




    }



}
