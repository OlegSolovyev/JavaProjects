package com.company;

public class Main {

    public static int[] merge(int[] array1, int[] array2){
        int[] newArray= new int[array1.length+array2.length];
        int i=0;
        int j=0;
        int counter=0;
        int lengthDifference=(array1.length-array2.length>0)?array1.length-array2.length:array2.length-array1.length;
        while (counter<newArray.length){
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
            counter++;
        }
        if (lengthDifference!=0) {
            newArray[newArray.length - lengthDifference] = (array1[array1.length - lengthDifference] > array2[array2.length - lengthDifference]) ? array1[array1.length - lengthDifference] : array2[array2.length - lengthDifference];
        }else {
            newArray[newArray.length - 1] = (array1[array1.length - 1] > array2[array2.length - 1]) ? array1[array1.length - 1] : array2[array2.length - 1];
        }
        return newArray;
    }

    public static void main(String[] args) {
	int[] arr1={2,4,6,8,10,15,16,17,18,19};
	int[] arr2={1,3,5,11,12,13};
	int[] arrFin= merge(arr1,arr2);
        for(int i=0;i<arrFin.length;i++){
            System.out.println(arrFin[i]);
        }
    }
}
