package com.company;

public class Main {

    public static void printInteger(int a){
        // printinteger    printIntegr print_Integer
        System.out.println("Печать из print2  a="+a);
    }

    public static void add(int a, int b){
        int c= a+b;
        System.out.println("a(" + a+ ") + b("+ b+ ") ="+c);
    }

    public static void main(String[] args) {
        printInteger(100);
        add(10,15);
        add(100,150);


        String name = "Andy";
        String bay = "пока";
        String space = ", ";

        String message;

        message = bay + space + name;
        System.out.println(message);

        message = "Новое сообщение:";
        System.out.println(message);

        print();
        print();
    }

    public static void print (){
        System.out.println("Печать из метода print");
        System.out.println("Вторая срока из метода print");
    }

}
