package HW_6;

public class App2 {
    public static void main(String[] args) {
        Person person = new Person();
        Salary salary= new Salary();

        person.gender = "M";
        person.gender = "Ms";


        System.out.println(person.getName("Bob"));

        Employee employee = new Employee();
        employee.person.name = "Bob";
        employee.wage =15000;


        Employee employee1 = new Employee();
        employee1.person.name = "Bob";
        employee1.wage =20000;

        employee.isSameName(employee1);
        System.out.println(employee.isSameName(employee1));

        Employee[] arr={employee,employee1};
        System.out.println(salary.getSum(arr));


    }
}
