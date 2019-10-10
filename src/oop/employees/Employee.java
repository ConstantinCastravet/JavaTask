package oop.employees;

public class Employee {
    private double tariffPerHour = 5.5;
    public int hours=8;

    public double getSalary() {
        return getTariffPerHour() * hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }
}
