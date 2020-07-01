package com.company;

public class Main {

    public static String errorMessage(int errorNumb){
        switch (errorNumb){
            case 1:
                return "ERROR";
                break;
        }
    }

    public static int changePosition(int a){
        if (a>9 && a<100) {
            return (a / 10) + (a%10) * 10;
        } else {
            errorMessage(1);
            return 1;
        }
    }

    public static void main(String[] args) {
        int a=32;
        if (changePosition(a) ==0){
            System.out.println("error");
        }else {
            System.out.println(changePosition(a));
        }
    }
}
