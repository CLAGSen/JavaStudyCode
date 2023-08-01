package Test112.Test11202;

public class HourlyEmployee extends Employee{
    private double wage;
    private int hour;

    public HourlyEmployee() {
    }

    @Override
    public double earnings() {
        return wage*hour;
    }

    public HourlyEmployee(String name,
                          double number,
                          MyDate birthday,
                          double wage,
                          int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourlyE:"+super.toString();
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
