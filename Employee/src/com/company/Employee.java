package com.company;

public class Employee {
    private String name;
    private double salary;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public void paySalary(){
        System.out.println("Salary payed: "+salary);
    }

    public void work(){
        System.out.println("I'm working");
    }

    public double getSalary(){
        return salary;
    }
}
