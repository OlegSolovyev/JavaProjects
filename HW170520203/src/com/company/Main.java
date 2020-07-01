package com.company;

public class Main {

    public static int sumOfDigits(int a, String inta){
        int rez=0;
        for (int i=0; inta.length()>i; i++){
            rez = rez+a%10;
            a=a/10;
        }
        return rez;
    }

    public static void main(String[] args) {
	int a=3657654;
	String inta = (String.valueOf(a));
        System.out.println(sumOfDigits(a, inta));
    }
}
