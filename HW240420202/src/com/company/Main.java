package com.company;

public class Main {

    public static int judge(int a, int b) {
        int rez;
        boolean bool=a>b;

        if (bool) {
             rez = a;

        } else {
             rez = b;

        }
        return rez;
    }

    public static void main(String[] args) {

    int s=judge(50,110);
    System.out.println(s);
    boolean k=moreThen100(100);
    System.out.println(k);

    }

    public static boolean moreThen100(int a){
        boolean hi= a>100;
        return hi;
    }
}
