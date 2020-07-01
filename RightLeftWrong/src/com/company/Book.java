package com.company;

public class Book {
    String name;
    int price;
    int length;
    String genre;


    public void print(String name, int price, int length, String genre) {
        System.out.println("The book: " + name + " costs: " + price);
    }
}
