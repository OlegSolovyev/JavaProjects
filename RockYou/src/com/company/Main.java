package com.company;

public class Main {

    public static void forDemo(int n, String string){
        System.out.println("forWhile demo start");
        int i = 0;
        for (; i<n;i++) {
            System.out.println(i + ") " +string);
        }
        System.out.println(i);
        System.out.println("forWhile demo finish");
    }

    public static void doWhileDemo(int n, String string){
        System.out.println("while demo start");
        int i = 1;
        do {
            System.out.println(i + ") " +string);
            i++;
        } while ( i<n);
        System.out.println(i);
        System.out.println("while demo finish");
    }

    public static void main(String[] args) {
	doWhileDemo(4, "DIE INSECT!");
    }
}
