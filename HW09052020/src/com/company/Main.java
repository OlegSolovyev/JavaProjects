package com.company;

public class Main {

    public static int SumFromTo1(int a, int b){
        int i=(a<b)? a: b;
        int sum=0;
        if (a != b) {
            while (i <= ((a < b) ? b : a)) {
                sum = sum + i;
                i++;
            }
            return sum;
        }
        return a+b;
    }

    public static int SumFromTo2(int a, int b){
        int i=(a<b)? a: b;
        int sum=0;
        if (a != b) {
            do {
                sum = sum + i;
                i++;
            } while (i <= ((a < b) ? b : a));
            return sum;
        }
        return a+b;
    }

    public static int SumFromTo3(int a, int b){
        int sum=0;
        if (a != b) {
            for (  int i=(a<b)? a: b; i <= ((a < b) ? b : a); i++){
                sum=sum+i;
            }
            return sum;
        }
        return a+b;
    }

    public static void main(String[] args) {
	System.out.println(SumFromTo1(5, 5));
	System.out.println(SumFromTo2(5, 5));
	System.out.println(SumFromTo3(6, 5));
    }
}
