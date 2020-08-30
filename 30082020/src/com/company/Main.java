package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people= new ArrayList<>();
        Person p1= new Person("p1",null);
        Person p2= new Person("p2",null);
        Person p3= new Person("p3",null);
        Person p4= new Person("p4",null);
        Address email1= new Address("email", "p.1@gmail.com");
        Address email2= new Address("email", "p.2@gmail.com");
        Address email3= new Address("email", "p.3@gmail.com");
        Address home1= new Address("Home", "Str. a");
        Address home3= new Address("Home", "Str. b");
        Address home4= new Address("Home", "Str. c");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        p1.addAddress(email1);
        p1.addAddress(email2);
        p1.addAddress(home4);
        p2.addAddress(email3);
        p2.addAddress(home1);
        System.out.println(people.toString());
    }
}
