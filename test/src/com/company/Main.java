package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Oleg";
        p1.age = 15;

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "Jack The Ripper";

        p1.print();
        p2.print();
    }
}
