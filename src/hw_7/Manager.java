package hw_7;

public class Manager extends Worker {
    private  int numberofSubordinates;



    public Manager(double baseSalary, String name, int numberofSubordinates) {
        super(baseSalary, name);
        this.numberofSubordinates = numberofSubordinates;
    }
    public int getNumberofSubordinates() {
        return numberofSubordinates;
    }
    public  void setNumberofSubordinates(int numberofSubordinates){
        this.numberofSubordinates = numberofSubordinates;
    }
}
