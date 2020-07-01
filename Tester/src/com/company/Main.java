package com.company;

public class Main {

    public static int[] getArray(int size, int min, int max){
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*(max-min+1)+min);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arrFin=getArray(10,2,12);
        for(int i=0;i<arrFin.length;i++){
            System.out.println(arrFin[i]);
        }
    }
}
