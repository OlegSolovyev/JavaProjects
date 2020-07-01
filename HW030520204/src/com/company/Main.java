package com.company;

public class Main {

    public static double calc(double a, double b, String act){
        double rez;
        switch (act){
            case "+":
            rez = a+b;
            break;
            case "-":
            rez= a-b;
            break;
            case "*":
            rez= a*b;
            break;
            case "/":
            rez= a/b;
            break;
            default:
            rez=0/0;
        }
        return rez;
    }

    public static void main(String[] args) {
        System.out.println(calc(10,3,"/"));
    }
}
