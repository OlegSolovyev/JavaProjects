package com.company;

public class Main {

    public static boolean checkDebit(double debitAmount, double account, double bankInterest){
        boolean cost = account >= (debitAmount + (debitAmount*(bankInterest/100)));
        return cost;
    }

    public static double getPercent(double amount, double interest){
        double rez = amount*(interest/100);
        return rez;
    }

    public static int abs(int a){
        int c;
        if (a<0){
            c = a*(-1);
        } else {
            c = a;
        }
        return c;
    }

    public static void main(String[] args) {
        boolean s = checkDebit(500,550, 10);
        System.out.println(s);
        double t = getPercent(1200,10);
        System.out.println(t);
        int d = abs(5);
        System.out.println(d);

    }
}
