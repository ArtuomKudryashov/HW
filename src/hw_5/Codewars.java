package hw_5;

public class Codewars {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        System.out.println(a!=0);
        Flower one = new Flower();
        one.isLove(13,13);


  }

}

class Flower{
        void isLove(final int flower1, final int flower2) {
        if (flower1 % 2 != 0 || flower2 % 2 != 0) {
           System.out.println("Они влюблены");
        } else if((flower1+flower2)%2==0 ) {

            System.out.println("Они не влюблены");
        }else {
            System.out.println("Они влюблены");


        }

    }
    public static void task(int aa) {
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = " Задача № ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + aa + rb);
    }

}
