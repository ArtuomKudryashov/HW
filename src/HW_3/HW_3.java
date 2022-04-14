package HW_3;

public class HW_3 {
    public static void main(String[] args) {


        int taskn = 1;


        String task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" ;
        System.out.println(task);
        int a = 15;
        int b = 24;

        if ( a == b ) {
            System.out.println("Переменная  a  и  b равны");
        } else if ( a < b) {
            System.out.println("Переменная  a меньше b");
        } else {
            System.out.println("Переменная  a больше b");

        }


        taskn = 2;

        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" ;
        System.out.println(task);

        a = 100;
        b = 325;

        if ( (a + b) % 2 != 1 ) {
            System.out.println("maybe a and b are even");

        } else {
            System.out.println("some variable is odd");
        }
        taskn = 3;

        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" ;
        System.out.println(task);


        a = 415;

        if ( 10 < a && a <100 && 20 < a / 2  && 5 <= a && a <= 40) {
            System.out.println("переменная больше 10 \n" + "переменная  меньше 100  ");
            System.out.println( "результат деления на 2 больше 20" );
            System.out.println("значение переменной между 5 и 40 включительно");


        } else {
            System.out.println("значение переменной меньше 5 или больше 40");



            }
        if ( a > 10) {
            System.out.println("больше 10");
        }
        if ( a < 100) {
            System.out.println("переменная  меньше 100");


        }
        if ( a / 2.0 > 20) {
            System.out.println("результат деления на 2 больше 20");

        }
        if (5 <= a && a <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");


        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }



        taskn = 4;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" ;
        System.out.println(task);

        for (int i = 0; i < 16 ; i++) {
            System.out.println(i);
        }
        taskn = 5;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" ;
        System.out.println(task);

        for ( int i = 1; i < 10000; i = i *5 ) {
            System.out.println(i);

        }
        taskn = 6;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" ;
        System.out.println(task);

        for  (int i = 40 ; i <= 60 ; i++ ) {
            if  (i % 4 == 0) {
                System.out.println(i);
            }
        }

        taskn = 6;
        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" ;
        System.out.println(task);
        for ( int i =40; i <=60; i = i + 4 ) {
            System.out.println(i);
        }
















    }
}
