package com.company;

public class Main {

    public static int getSumFromTo(int a, int b){
        int i = (a>b)? b:a;
        int sum=0;
        while (i <= ((a>b)?a:b)){
            sum=sum+i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
	System.out.println(getSumFromTo(3,4));
    }
}
