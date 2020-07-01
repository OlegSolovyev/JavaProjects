package com.company;

public class Main {

    public static boolean coffeeCook(int coffee, int water, boolean milk){
        return true;
    }

    public static String choice(int coffee){
        String rez="error";
        switch (coffee){
            case 1:
                rez= (coffeeCook(3,2,true)) ? "Cappuccino": rez;
                break;
            case 2:
                rez= (coffeeCook(2,3,true)) ? "Latte": rez;
                break;
            case 3:
                rez= (coffeeCook(1,1,false)) ? "Espresso": rez;
                break;
        }
        return rez;
    }

    public static void print(String coffeeString){
        if(coffeeString !="error"){
            System.out.println("Your " + coffeeString + " is ready!!!");
        } else {
            System.out.println("Something gone wrong :(");
        }
    }

    public static void main(String[] args) {
        String coffee=choice(1);
        print(coffee);

    }
}
