package com.company;

public class Main {

    public static boolean checkDiv(int a, int b){
        boolean s = a%b == 0;
        return s;
    }

    public static boolean isLeapYear(int a, int b){
        boolean t = a%b == 0;
        return t;
    }

    public static boolean dateValidate(int day, int month, int Year){
            boolean yes = ((day>0) && (day<32)) && ((month>0) && (month<13));
        return yes;
    }

    public static void main(String[] args) {
        System.out.println(checkDiv(10,2));
        int a = 4;
        System.out.println(isLeapYear(2004,a));
        System.out.println(dateValidate(31,13,2010));

    }
}
