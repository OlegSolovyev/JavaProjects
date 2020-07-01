package com.company;

public class Manager extends Employee {
    private double managerBonus;

    public Manager(double salary, String name) {
        super(salary,name);
    }

    public void paySalary(){
        System.out.println("Salary payed to Manager: "+getSalary()+managerBonus);
    }
}
