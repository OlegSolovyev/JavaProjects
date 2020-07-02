package com.company;

public class Manager extends Programmer {
    private double managerBonus;

    public Manager(double salary, String name) {
        super(salary,name);
    }

    public void paySalary(){
        System.out.println("Salary payed: "+getSalary()+managerBonus);
    }
}
