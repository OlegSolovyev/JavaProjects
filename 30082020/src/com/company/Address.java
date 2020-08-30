package com.company;

public class Address {
    private String kindOfAddress;
    private String address;

    public Address(String kindOfAddress, String address) {
        this.kindOfAddress = kindOfAddress;
        this.address = address;
    }

    @Override
    public String toString() {
        return kindOfAddress +":  "+address;
    }
}
