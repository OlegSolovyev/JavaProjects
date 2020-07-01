package com.company;

public class Programmer extends Employee {

    public Programmer(double salary, String name) {
        super(salary,name);
    }

    public void startTask(String task){
        setTask(task);
        System.out.println("I started doing the task, Pro: "+task);
    }

    public void finishTask(){
        System.out.println("I finished doing the task, Pro: "+getTask());
    }

}
