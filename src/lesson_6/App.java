package lesson_6;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name ="Anna";
//        person.age = 30;

        Person person1 = new Person();
        person1.name ="Sergey";
        person1.age = 30;

        Person person2 = new Person();
        person2.name ="Deni";
        person2.age = 30;

        Person person3 = new Person();
        person3.name ="Bob";
        person3.age = 30;


        person.printName();
        person1.printName();
    }
}
