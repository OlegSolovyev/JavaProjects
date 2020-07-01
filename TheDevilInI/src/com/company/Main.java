package com.company;

public class Main {

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        }
    }

    private static int getMimInd(int[] arr, int startInd) {
        int min = arr[startInd];
        int smallestNumbIndex = startInd;
        for (int i = startInd; i < arr.length; i++) {
            if (arr[smallestNumbIndex] > arr[i]) {
                smallestNumbIndex = i;
            }
        }
        return smallestNumbIndex;
    }



    public static int[] switchedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minInd=getMimInd(array,i);
            if(minInd!=i) {
                swap(array, minInd, i);
            }
            }
        return array;
    }

    public static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        int[] array={5,3,6,2,4,1,1,1};
        switchedArray(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
