package com.company;

public class Main {

    public static int[][] areThereTwoNumbersThatGiveInSumN(int[] array,int n){
        int counter=0;
        int[] arrayI= new int[array.length];
        int[] arrayJ= new int[array.length];
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==n){
                    counter++;
                    arrayI[i]=i;
                    arrayJ[j]=j;
                }
            }
        }
       int[][] doubleArray= new int[counter][2];
        for (int i=0;i<counter;i++){
            doubleArray[i][0]=arrayI[i];
        }
        for (int j=0;j<counter;j++){
            doubleArray[j][1]=arrayJ[j];
        }
        return doubleArray;
    }

    public static void main(String[] args) {
	int[] array={1,4,6,7,8};
        System.out.println(areThereTwoNumbersThatGiveInSumN(array,13));
    }
}
