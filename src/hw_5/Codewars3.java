package hw_5;

public class Codewars3 {
    public static void main(String[] args) {

//    Kata.countingSheep(5);
//        System.out.println(Kata.countingSheep(5));
        Kata.countingSheep(5);
        System.out.println(Kata.countingSheep(10));


    }

class Kata {
    public static String countingSheep(int num) {
        String result = "";
        int i = 0;
        while (i < num) {
            result += (i + 1) + " sheep...";
            i++;
        }
        return result;
    }
}
}
