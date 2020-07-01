package com.company;

public class Main {

    public static void multiply1(int a){
        int i = 1;
        String table = "";
        while (i<=10){
            table= a + "x" + i + "=" + (a*i);
            System.out.println(table);
            i++;
        }
    }

    public static void multiply2(int a){
        int i = 1;
        String table = "";
        do{
            table= a + "x" + i + "=" + (a*i);
            System.out.println(table);
            i++;
        } while (i<=10);
    }

    public static void multiply3(int a) {
        String table = "";
        for (int i = 1; i<=10; i++){
            table= a + "x" + i + "=" + (a*i);
            System.out.println(table);
        }
    }


    public static void main(String[] args) {
	multiply1(1);
	multiply2(2);
	multiply3(3);
    }
}
