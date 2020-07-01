package com.company;

public class Person {
    String name;
    int yearOfBirth;
    int weight;
    Car car;

    public void print(){
        System.out.println(name +"["+ getAge()+"]" + ((weight!=0)?weight:""));
        if(car!=null){
            System.out.println("  has a car "+car.toString());
        }
    }

    public int getAge (){
        return 2020-this.yearOfBirth;
    }

    public Person(String name, int yearOfBirth){
        this.name=name;
        this.yearOfBirth=yearOfBirth;
    }


    public Person(String name, int yearOfBirth, int wight){
        this.name=name;
        this.yearOfBirth=yearOfBirth;
        this.weight=wight;
    }
}
