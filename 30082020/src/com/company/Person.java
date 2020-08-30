package com.company;

import java.util.LinkedList;

public class Person {
private String name;
private LinkedList<Address> addresses;

    public Person(String name, LinkedList<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public void addAddress(Address address){
        if (addresses!=null) {
            addresses.add(address);
        } else {
            this.addresses=new LinkedList<Address>();
            addresses.add(address);
        }
    }

    @Override
    public String toString() {
        if (addresses!=null) {
            return
                    "name: " + name + '\n' +
                            "addresses: \n" + addresses.toString()+'\n';
        } else {
            return "name: "+name + '\n' +
                    "The Person doesn't have addresses\n";
        }
    }
}
