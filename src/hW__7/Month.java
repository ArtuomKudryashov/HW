package hW__7;

public class Month {
    private String name;
    private int days;
    private int workdays;

    public Month(String name, int days, int workdays) {
        this.name = name;
        this.days = days;
        this.workdays = workdays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }
}
