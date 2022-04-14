package hw_5;

public class Codewars2 {
    public static void main(String[] args) {
        task(1);

        int [] arr = {34, 15, 88, 2};
        int a = arr [0];
                for (int i = 0; i< arr.length; i++){
                    if (a > arr[i]){
                        a=arr[i];
                    }
                }
        System.out.println(a);

    }
    public static void task(int aa) {
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + aa + rb);
    }
}
