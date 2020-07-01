package com.company;

public class Main {

    public static void allDivisors1(int a){
        int i = a;
        while (i>0){
            if (a>0 && a%i==0){
                System.out.println(i);
            }
            i--;
        }
    }

    public static void allDivisors2(int a){
        int i = a;
        do{
            if (a>0 && a%i==0){
                System.out.println(i);
            }
            i--;
        } while (i>0);
    }

    public static void allDivisors3(int a){

        for (int i = a; i>0; i--){
            if (a>0 && a%i==0){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
	allDivisors1(345);
	allDivisors2(345);
	allDivisors3(345);
    }
}
