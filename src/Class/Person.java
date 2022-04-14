package Class;


public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String getName() {
        if (gender == 'M') {
            return "Mr. " + name;

        } else {
            return " Mrs. " + name;
        }
    }





}
