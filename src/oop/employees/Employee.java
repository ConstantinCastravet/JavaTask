package oop.employees;

public class Employee {
    private double tariffPerHour = 5.5;
    private int hours = 8;


    public Employee() {
    }

    public Employee(double tariffPerHour, int hours) {
        setHours(hours);
        setTariffPerHour(tariffPerHour);
    }

    public double getSalary() {
        return getTariffPerHour() * hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public void setTariffPerHour(double tariffPerHour) {
        this.tariffPerHour = tariffPerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
