package com.company;

public class Main {

    public static int countLeapYears1(int a, int b){
        int i=(a<b)? a: b;
        int number = 0;
        while (i <= ((a<b)? b: a)){
            if ((i%400==0) || ((i%4==0) && (i%100 != 0))){
                number++;
            }
            i++;
        }
        return number;
    }

    public static int countLeapYears2(int a, int b){
        int i=(a<b)? a: b;
        int number = 0;
        do{
            if ((i%400==0) || ((i%4==0) && (i%100 != 0))){
                number++;
            }
            i++;
        }  while (i <= ((a<b)? b: a));
        return number;
    }

    public static int countLeapYears3(int a, int b){
        int number = 0;
        for (int i=(a<b)? a: b; i <= ((a<b)? b: a); i++){
            if ((i%400==0) || ((i%4==0) && (i%100 != 0))) {
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
	System.out.println(countLeapYears1(2099, 2120));
	System.out.println(countLeapYears2(1999, 2020));
	System.out.println(countLeapYears3(1999, 2020));
    }
}
