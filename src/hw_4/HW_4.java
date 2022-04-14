package hw_4;

import java.util.Arrays;
import java.util.Locale;

public class HW_4 {
    public static void main(String[] args) {
        int taskn = 1;


        String task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        String sum = " Cумма всех  значений массива = ";
        String maxim = " Максимальное значение масссива = ";


        int summ = 0;
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array1.length; i++) {
            summ = summ + array1[i];
        }
        System.out.println(sum + summ);
        System.out.println("Second way");
        System.out.println(sum + Arrays.stream(array1).sum());

        taskn = 2;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);


        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }

        }
        System.out.println(max);


        taskn = 3;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);


        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);


        taskn = 4;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        summ = 0;
        int[] aver = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            summ = summ + aver[i];
        }
        int av = summ / aver.length;
        System.out.println(av);


        taskn = 5;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);

        int[][] arr5 = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        summ = 0;
        int summ1 = 0;
        int summ2 = 0;
        int summ3 = 0;
        int summ4 = 0;


        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                summ = summ + arr5[i][j];
            }


        }

        System.out.println(summ);


        taskn = 6;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        int[][] arr6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        max = arr6[0][0];
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                if (arr6[i][j] > max) {
                    max = arr6[i][j];
                }
            }

        }
        System.out.println(maxim + max);


        taskn = 7;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);

        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println("Количество элементов = " + array7.length);
        System.out.println(Arrays.stream(array7).count());
        int quantity = 0;
        for (int i = 0; i < array7.length; i++) {

            for (int j = 0; j < array7[i].length; j++) {
                quantity++;
            }
        }
        System.out.println("Кол-во цифр = " + quantity);
        taskn = 8;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        String s = "Перестановочный  алгоритм  быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }
        taskn = 9;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);

        String tim = " Ты кто такой, давай до свидания ";
        quantity = 0;
        for (int i = 0; i < tim.length(); i++) {
            if (tim.charAt(i) == 'о') {
                quantity++;
            }
        }
        System.out.println(quantity);
        taskn = 10;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);

        String ss = "Посмотрите как Рите нравится ритм ";
        ss = ss.toLowerCase();
        String sub = "рит";
        for (int i = 0; i < ss.length() - sub.length(); i++) {
            if (ss.substring(i, i + sub.length()).equals(sub)) {
                System.out.println(i);
            }


        }
        int index = ss.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = ss.indexOf("рит", index + 1);

        }
        for (int j = 0; j < ss.length(); j++) {
            if (ss.charAt(j) == 'р' && ss.charAt(j + 1) == 'и' && ss.charAt(j + 2) == 'т' ||
                    ss.charAt(j) == 'Р' && ss.charAt(j + 1) == 'и' && ss.charAt(j + 2) == 'т') {
                System.out.println(j);

            }
        }
        taskn = 10;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);
        String[][] array10 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int count = 0;

        for (int i = 0; i < array10.length; i++) {
            for (int j = 0; j < array10[i].length; j++) {
                if (!array10[i][j].contains("е")) {
                    count++;

                }

            }
        }
        System.out.println(count);


        taskn = 550;


        task = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + " Задача № " + taskn + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(task);

        int[][] arr55 = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        summ = 0;
        int summ11 = 0;
        int summ22 = 0;
        int summ33 = 0;
        int summ44 = 0;
        int x = arr5.length;

        for (int i = 0; i < arr5.length; i=1) {
            for (int j = 0; j < arr5[i].length; j++) {
                summ = summ + arr5[i][j];
            }


        }


        System.out.println("Сумма елементов первой строки равна: " + summ1);

        System.out.println(summ);






    }


}
