package hw_5;

import java.util.Arrays;

public class hw_52 {
    public static void main(String[] args) {






            for (int i =9 ; i>=0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" " + j);
                }
                System.out.println();
            }
            System.out.println();


            for (int i = 9; i >= 0; i--) {
                for (int j = 9; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        


            for (int i = 9; i >= 0; i--) {                       //рисуем пробелы
                for (int j = 9; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 0; j--) {                // погнали с 9 до 0 первую половину
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= i; j++) {                      // погнали вторую половину
                    System.out.print(j + " ");

                }
                System.out.println();
            }


//        String[][] chess = new String[8][8];
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    System.out.print("W ");
//
//                } else {
//                    System.out.print("B ");
//                }
//            }
//            System.out.println();
//


    }
}
