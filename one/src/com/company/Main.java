package com.company;

public class Main {
    public static void print2(int a){
        System.out.println("print from method print2 a = "+ a);
    }

    public static void main(String[] args) {
        print2( 100);

        String greetings = "hello";
        String name = "Oleg";
        String bay = "Goodbay";
        String space = ", ";

        String message;
        message = bay + space + name;
        System.out.println(message);
        message = "New message:";
        System.out.println(message);

        print();
        print();
    }

    public static void  print(){
        System.out.println("print from method 'print'");
        System.out.println("Second line from method print");
    }

}
