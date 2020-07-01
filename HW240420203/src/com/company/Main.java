package com.company;

public class Main {

    public static  double calc(double a, double b, String act){
        if (act == "+"){
            return a+b;
        } else {
            if (act == "-"){
                return a-b;
            } else {
                if (act == "*"){
                    return a*b;
                } else {
                    if (act == "/"){
                        return a/b;
                    } else {
                        System.out.println("ERROR");
                        return  0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
	double s=calc(15,22,"+");
	// a = first number, b = second number, act = action ( + , - , * , / )
	System.out.println(s);
    }
}
