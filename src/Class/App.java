package Class;

public class App {
    public static void main(String[] args) {
       Person p1 = new Person("Artuom",38, 'M' );
       Person p2 = new Person("Anna",20, 'F' );

       Person [] personArray = {p1,p2};

        System.out.println(p1.getName());
        Person pMin=PersonHelper.getMinAge(personArray);
    }
}
