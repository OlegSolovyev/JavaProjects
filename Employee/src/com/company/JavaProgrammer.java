package com.company;

public class JavaProgrammer extends Employee{

    public JavaProgrammer(double salary, String name) {
        super(salary,name);
    }

    public void work(){
        System.out.println("I'm Java Programmer. I write Java Program");
    }

    public void codeReview(){
        System.out.println("This Java code is good");
    }
}
