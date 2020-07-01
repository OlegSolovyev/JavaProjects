package com.company;

public class Main {

    public static void main(String[] args) {
	double a = 1.53;
	int b = (int)a;
	System.out.println((a-b>=0.5)? ++b: b );
    }
}
