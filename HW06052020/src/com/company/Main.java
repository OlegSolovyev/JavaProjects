package com.company;

public class Main {

    public static int change(int a){
        int hundreds = a/100;
        int ones=a%10;
        int tens=(a-(hundreds*100)-ones)/10;
        return ones*100 + tens*10 + hundreds;
    }

    public static int count(int a){
        int hundreds = a/100;
        int ones=a%10;
        int tens=(a-(hundreds*100)-ones)/10;
        return ones+tens+hundreds;
    }

    public static String divideBy2(int a){
        return  (((a/100)%2 == 0)? "       | Hundreds could be divided by 2 | ": "       | Hundreds couldn't be divided by 2 | ") + (((a/10)%2 == 0)? "Tens could be divided by 2 | ": "Tens couldn't be divided by 2 | ") + ((a%2 == 0)? "Ones could be divided by 2 | ": "Ones couldn't be divided by 2 | ");
    }

    public static String connection(int a){
        return "Your number " + a + "       End number " + (((change(a))<100)? (((change(a))<10)? "00" + change(a): "0" + change(a)) : change(a)) + "       Sum of digits " + count(a) + divideBy2(a);
    }

    public static void main(String[] args) {
	int a = 100;
	while (a<200){
        if (a > 99 && a < 1000) {
            System.out.println(connection(a));
        } else {
            System.out.println("ERROR");
        }
        a++;
    }
    }
}
