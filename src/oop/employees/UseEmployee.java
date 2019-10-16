package oop.employees;

public class UseEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Tariff per hour for employer: " + emp.getTariffPerHour());
        System.out.println("Salary of employer: " + emp.getSalary() + "\n");


        Employee manager = new Manager();


        System.out.println("Tariff per hour for manager: " + manager.getTariffPerHour());
        System.out.println("Salary of manager: " + manager.getSalary());


    }
}
