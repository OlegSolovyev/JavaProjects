package com.company;

public class Student {
    private String name;
    private String group;
    private double reit;
    private int reitArray[];

    public Student (String name, String group, int[] reitArray){
        this.name=name;
        this.group=group;
        this.reitArray=reitArray;
    }

    public String toString(){
        return  "Student (name = " + name + "    Group = " + group + " " + getReit() + ")";
    }

    public double getReit() {
        if (this.name.equals("Oleg"));{
            calcReit();
        }
        return reit;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void calcReit(){
        double avg=0.0;
        for (int reit: reitArray){
            avg+=reit;
        }
        reit= avg/reitArray.length;
    }
}
