package com.company;

public class Main {

    public static double convert(double a, String b){
        double rez;
        switch (b){
            case "USD":
                rez= a*1;
                break;
            case "EUR":
                rez= a*0.90;
                break;
            case "RUR":
                rez= a*75.38;
                break;
            case "GPB":
                rez= a*0.80;
                break;
            default:
                rez= a/0;
        }
        return rez;
    }

    public static void main(String[] args) {
	System.out.println(convert(5,"RUR"));
    }
}
