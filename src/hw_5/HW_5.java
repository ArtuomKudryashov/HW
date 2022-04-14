package hw_5;

public class HW_5 {
    public static void main(String[] args) {

        task(1);
        summ(3,3,3,3);
        casl();

        cas(2);


    }
    public  static void  summ(int a, int b, int c,  int d){
        System.out.println("Посчитаем сумму");
        System.out.println("Значение a + b = "+ a + b);
        System.out.println((a + b)+Math.pow(c,d));
        sub(a,b);
        mult(a,b);
        dev(a,b);
        casl();

        cas(2);


        int case2 = multipl3(2,3);
        System.out.println(case2);


    }
    public  static void task (int a) {
        String ll = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ";
        String rl = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        String task = " Task # ";
        System.out.println(ll+task +a+rl);


    }
    public static  void casl (){

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static  void cas (int k){
        System.out.println("Case "+k);

    }

        public static  void sub (int a, int b){
        System.out.println("Посчитаем разность");
        char sc =';';
        int c = a - b;
        System.out.println("Значение a - b = "+c + sc);
    }

    public static  void mult (int a, int b){
        char sc =';';
        System.out.println("Посчитаем произведение");
        double t = ((1.0*a * b/2));
        System.out.println("Значение a * b = "+t +sc);
    }

    public static  void dev (double a, double b) {
        char sc =';';
        System.out.println("Посчитаем Частное");
        System.out.println("Значение a / b = "+(a / b) * 2+sc);
    }



     static int mult1 (int a, int b){
        return (a * b);

    }
    static int  dev1 (int a, int b){
        char sc =';';
        return (a / b) +sc;
    }
    public static int  sub1(int a, int b){
        char sc =';';

        return (a-b)+sc;
    }
     public static   int  multipl3( int a, int b){
         char sc =';';
        return (( a + b)+ (dev1(a,b))+sub1(a,b))+(mult1(a,b)+sc);

    }
}
