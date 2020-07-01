package com.company;

public class MergeSort {

    public static int[] merge(int[] array1, int[] array2){
        int[] newArray= new int[array1.length+array2.length];
        int i=0;
        int j=0;
        while (i<array1.length-1 && j<array2.length-1){
            if (array1[i]>array2[j]){
                newArray[i+j]=array2[j];
                if(j<array2.length-1){
                    j++;
                }
            } else {
                newArray[i+j]=array1[i];
                if(i<array1.length-1){
                    i++;
                }
            }
        }
        return newArray;
    }


}
