package com.company;

public class Main {

    public static boolean check(int a, int b){
        return  ((a+b)%2==0) ? true: false;
    }

    public static boolean check2(int a){
        return (a%2==0)? true: false;
    }

    public static String connect(int a, int b){
        String rez="";
        if (check(a,b)){
            rez = (check2(a))?"четные": "не четные";
        } else {
            rez = (check2(a))?"а четное, b не четное": "а не четное, b четное";
        }
        return rez;
    }

    public static void main(String[] args) {
        int a=4;
        int b=4;
	System.out.println(connect(a,b));
    }

    
}
