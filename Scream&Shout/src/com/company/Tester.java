package com.company;

public class Tester extends Employee {
    private double salary;
    private String name;
    private String task;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Tester(double salary,String name) {
        super(salary,name);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", task='" + task + '\'' +
                '}';
    }
}
