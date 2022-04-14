package HW_6;

public class Employee {
    Person person = new Person();
    int wage;

    boolean isSameName(Employee employee){
        if(person.name.equals(employee.person.name)){
            return  true;
        } else {
            return false;
        }
    }
}
