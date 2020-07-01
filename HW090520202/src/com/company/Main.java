package com.company;

public class Main {

    public static void printLeapYears1(int a, int b){
        int i=(a<b)? a: b;
        while (i <= ((a<b)? b: a)){
            if ((i%400==0) || ((i%4==0) && (i%100 != 0))){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printLeapYears2(int a, int b){
        int i=(a<b)? a: b;
        do{
            if ((i%400==0) || ((i%4==0) && (i%100 != 0))){
                System.out.println(i);
            }
            i++;
        }  while (i <= ((a<b)? b: a));
    }

    public static void printLeapYears3(int a, int b){
        for (int i=(a<b)? a: b; i <= ((a<b)? b: a); i++){
            if ((i%400==0) || ((i%4==0) && (i%100 != 0))) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
	printLeapYears1(2222, 1992);
	printLeapYears2(2222, 1992);
	printLeapYears3(2222, 1992);
    }
}
