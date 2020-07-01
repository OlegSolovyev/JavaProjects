package com.company;

public class Main {

    public static int[] reverse(int orig[]){

        int i = orig.length - 1;
        int j = 0;
        while(j<=(orig.length/2)){
            int k = orig[j];
            orig[j] = orig[i];
            orig[i] = k;
            j++;
            i--;
        }
        return orig;
    }

    public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5,6,7};
	reverse(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
    }
}
