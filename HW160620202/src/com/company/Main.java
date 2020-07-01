package com.company;

public class Main {

    public static int strByLength(String str1, String str2){
        //return str1.length()-str2.length();
        return str1.compareTo(str2);
    }

    public static void bubbleSort(String[] array){
        int j=0;
        int counter=0;
        for(int i=0;i<array.length-j;i++,j++){
            if (strByLength(array[i] ,array[i+1])>0) {
                String k=array[i+1];
                array[i+1]=array[i];
                array[i]=k;
                counter++;
            }
        }
        if(counter>0){
            bubbleSort(array);
        }
    }

    public static void bubbleSort1(String[] array){
        boolean swapFlag=true;
        int j=0;
        while (swapFlag==true) {
            swapFlag=false;
            for (int i = 1; i < array.length - j; i++, j++) {
                if (strByLength(array[i], array[i - 1]) < 0) {
                    String k = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = k;
                    swapFlag=true;
                }
            }
        }
    }

    public static int returnSmallestIndex(int[] array, int index1, int index2){
        int smallestNumberIndex=index1;
        for(int i=index1+1;i<=index2;i++){
            if(array[smallestNumberIndex]>array[i]){
                smallestNumberIndex=i;
            }
        }
        return smallestNumberIndex;
    }

    public static void main(String[] args) {
	int[] array={8,4,7,8,5,9,1,1,1};
	String[] strings={"c","d","b","a","f","e"};
	bubbleSort1(strings);
        System.out.println(returnSmallestIndex(array,0,5));
        System.out.println("----------------------------------------");
	//bubbleSort(array);

        for(int i=0;i<strings.length;i++){
            System.out.print(strings[i]+" ");
        }
        System.out.println();
	for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
    }
        System.out.println("----------------------------------------");
        System.out.println(returnSmallestIndex(array,0,5));
    }
}
