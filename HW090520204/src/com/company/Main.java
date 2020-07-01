package com.company;

public class Main {

    public static void side1(int a){
        int i = 0;
        String b = " ";
        while (i<a){
            b = b+"*  ";
            i++;
        }
        printSquare1(b, a);
    }

    public static void printSquare1(String b, int a) {
        int i = 0;
        while (i<a){
            System.out.println(b);
            i++;
        }
    }

    public static void side2(int a){
        int i = 0;
        String b = " ";
        do{
            b = b+"*  ";
            i++;
        } while (i<a);
        printSquare2(b, a);
    }

    public static void printSquare2(String b, int a) {
        int i = 0;
        do{
            System.out.println(b);
            i++;
        } while (i<a);
    }

    public static void side3(int a){
        String b = " ";
        for (int i = 0; i<a; i++){
            b = b+"*  ";
        }
        printSquare3(b, a);
    }

    public static void printSquare3(String b, int a) {
        for (int i = 0; i<a; i++){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
	side1(1);
	side2(2);
	side3(3);
    }
}
