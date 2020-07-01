package com.company;

public class Main {

    public static String ending(int n){
        String end = "";
        int ones= n%10;
        int tens=(n/10)%10;
        end= (tens == 1)? " рублей": ((ones == 1)? " рубль": ((ones == 2 || ones == 3 || ones == 4)? " рубля": " рублей"));
        return end;
    }

    public static void printSumInRub(int a, int b){
        int i = (a<b)? a: b;
        while ((i<=((a<b)? b: a)) && i>=0){
            System.out.println(i + ending(i));
            i++;
        }
    }


    public static void printSumInRub2(int a, int b){
        int i = (a<b)? a: b;
        if (i>=0) {
            do {
                System.out.println(i + ending(i));
                i++;
            } while (i <= ((a < b) ? b : a));
        }
    }

    public static void printSumInRub3(int a, int b){
        if (a>=0 && b>=0){
       for(int i = (a<b)? a: b; (i<=((a<b)? b: a)); i++) {
           System.out.println(i + ending(i));
           }
        }
    }

    public static void main(String[] args) {
	printSumInRub(10, 1);
	printSumInRub2(10, 1);
	printSumInRub3(10, 1);
    }
}
