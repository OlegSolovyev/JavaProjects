package com.company;

public class Main {

    public static boolean are10And2There(int[] num){
        int i=0;
        int a=0;
        int b=0;
        while(i<num.length){
            if(num[i] == 20){
                a++;
            }
            if (num[i] == 10){
                b++;
            }
            i++;
            if (a>0 && b>0){

            }
        }
        return a>0 && b>0;
    }

    public static int smallestNumber(int[] num){
       int i=1;
       int smallest=num[0];
        while (i<num.length){
            if(num[i]<smallest){
                smallest = num[i];
            }
            i++;
        }
        return smallest;
    }

    public static void main(String[] args) {
	int num[] = {100,20,3,4,5,6,10};
        //System.out.println(are10And2There(num));
        System.out.println(smallestNumber(num));
    }
}
