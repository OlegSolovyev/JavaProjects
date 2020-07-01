package com.company;

import java.util.Arrays;

public class Main {

    public static int[] getArray(int size, int min, int max){
        int[] arr=new int[size];
        for (int i=0; i<arr.length; ++i){
            arr[i]=(int)(Math.random()*(max-min+1)+min);
        }
        return arr;
    }


    public static void main(String[] args) {
	int[] array=getArray(31,0,100);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        sort(array,0,array.length);

    }
    private static void sort(int[] arr, int from, int to){
            if(to-from>1){
                int middle=(from+to)/2;
                sort(arr,from,middle);
                sort(arr,middle,to);
                merge(arr,from,middle,to);
        }
    }

    private static void merge(int[] arr, int from, int middle, int to) {
        int[] arr1= Arrays.copyOfRange(arr,from,middle);
        int[] arr2= Arrays.copyOfRange(arr,middle,to);

        int x1=0, x2=0;
        int i=from;
        while (x1<arr1.length&&x2<arr2.length){
          /*  if(arr1[x1]<arr2[x2]){
                arr[i]=arr1[x1++];
            }else {
                arr[i]=arr2[x2++];
            }
            i++;*/
            arr[i++]=(arr1[x1]<arr2[x2]?arr1[x1++]:arr2[x2++]);
        }
        while (x1<arr1.length){
            arr[i++]=arr1[x1++];
        }
        while (x2<arr2.length){
            arr[i++]=arr2[x2++];
        }
    }
}
