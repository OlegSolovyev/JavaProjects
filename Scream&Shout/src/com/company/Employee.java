package com.company;

public class Employee {
    private double salary;
    private String name;
    private String task;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }


    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void startTask(String task){
        this.task=task;
        System.out.println("I started doing the task: "+task);
    }

    public void finishTask(){
        System.out.println("I finished doing the task: "+task);
    }

    public void paySalary(){
        System.out.println("Salary payed: "+salary);
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }
}
