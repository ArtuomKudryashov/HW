package HW_6;

public class Person {
    String name;
    int age;
    String gender;


    String getName(String name) {
        if (gender == "M") {
            return "Mr " + name;
        } else if (gender == "Ms") {
            return "Ms " + name;

        } else {
            return "Hey man , what are you talking about? ha";
        }
    }


}
