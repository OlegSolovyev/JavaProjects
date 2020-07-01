package com.company;

public class JavaScriptProgrammer extends Employee{

    public JavaScriptProgrammer(double salary, String name) {
        super(salary,name);
    }

    public void work(){
        System.out.println("I'm JavaScript Programmer. I write JavaScript Program");
    }

    public void codeReview(){
        System.out.println("This JavaScript code is good");
    }
}
