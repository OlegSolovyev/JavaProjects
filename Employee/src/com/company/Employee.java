package com.company;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public void paySalary(){
        System.out.println("Salary payed: "+salary);
    }

    public abstract void work();

    public double getSalary(){
        return salary;
    }
}
