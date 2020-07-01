package com.company;

public class Main {

    public static boolean check(int a, int b){
        boolean s = a == 10 || b == 10 || (a+b) == 10;
        return s;
    }

    public static boolean check1(int a, int b){
        boolean s = a < 0 && b > 100;
        return s;
    }

    public static boolean call(int a, boolean b){
        boolean s= ((a>-1) && (a<24)) && (b == true);
        return s;
    }

    public static void main(String[] args) {
        boolean t = check(5, 5);
        System.out.println(t);
        boolean m = check1(-1,1010);
        System.out.println(m);
        boolean k = call(23,true);
        System.out.println(k);

    }
}
