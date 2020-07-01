package com.company;

public class Main {

    public static boolean checkDigits(int a){
        int hundreds = a/100;
        int ones=a%10;
        int tens=(a - (hundreds*100))/10;
        return (hundreds !=0)? ((hundreds != ones) && (hundreds != tens) && (tens != ones)): (tens != ones);
    }

    public static void main(String[] args) {
	System.out.println(checkDigits(123));
	System.out.println(checkDigits(122));
	System.out.println(checkDigits(121));
	System.out.println(checkDigits(223));
	System.out.println(checkDigits(20));
    }
}
