package com.company;

public class CProgrammer extends Employee{

    public CProgrammer(double salary, String name) {
        super(salary,name);
    }

    public void work(){
        System.out.println("I'm C Programmer. I write C Program");
    }

    public void codeReview(){
        System.out.println("This C code is good");
    }
}
