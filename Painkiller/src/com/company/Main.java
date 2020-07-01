package com.company;

public class Main {

    public static double[] getArray(int size, int max, int min){
        double[] arr=new double[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()* (max-min+1)+min);
        }
        return arr;
    }

    public static void print(double[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.println((i) + " : "+ arr[i]);
        }
    }

    public static double theBiggestNumberFromTo(int from, int to, double[] arr){
        double theBiggest=0;
        for (int i=from; i<=Math.min(to,arr.length);i++){
            if(arr[i]>theBiggest){
                theBiggest=arr[i];
            }
        }
        return theBiggest;
    }

    public static void main(String[] args) {
        double[] array;
	array =getArray(15, 10,6);
	print(array);
        System.out.println(theBiggestNumberFromTo(5,1,array));
    }
}
