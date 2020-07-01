package com.company;

public class Main {

    public static void minus(int a, int b){
        //int c;
       // c= a-b;
       // System.out.println("a minus b = " + c);
        System.out.println("a minus b = " + (a-b));
    }

    public static void multiply(int a, int b){
       // int c;
       // c= a*b;
       // System.out.println("a multiply b = " + c);
        System.out.println("a multiply b = " + (a*b));
    }
    public static void div(int a, int b){
        System.out.println("a/b=" + (a/b));
    }
    public static String del(double a, double b){
        System.out.println(a + "/" + b + "=" + (a/b));
        return "wazzup gayz:" + a/b;
    }
    public static void main(String[] args) {
minus(100,50);
multiply(200,30);
del(1,2);
String s=del(5,4);
System.out.println(s);

    }
}
