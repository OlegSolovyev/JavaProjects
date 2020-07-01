package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names1 = {"Jason","Bob","Perry"};
        String[] names2= {"Carol","Julia","Mary"};
        print(names1);
        print(names2);
    }

    public static void print(String[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
