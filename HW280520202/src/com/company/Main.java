package com.company;

public class Main {
    int numbers[] = {10, 13, 3, 15, -9};

    public static int counter(int num[]){
        int i = 0;
        int sum = 0;
        while(i<num.length){
            sum += num[i];
            i++;
        }
        return sum;
    }

    public static int theHighestNumber(int num[]){
        int i = 0;
        int highest = num[0];
        while(i<num.length) {
            if (num[i] > highest) {
                highest = num[i];
            }
            i++;
        }
        return highest;

    }

    public static int whichPosition(int num[]){
        int i = 0;
        while(i<num.length) {
            if (num[i] == theHighestNumber(num)) {
                return i;
            }
            i++;
        }
        return -1;

    }

    public static int[] createReversedCopy(int orig[]){
        int revers[] = new int[orig.length];
        int i = orig.length - 1;
        int j = 0;
        while(i>=0){
            revers[j] = orig[i];
            i--;
            j++;
        }
        return revers;
    }

    public static int[] reverse(int orig[]){
        int revers[] = new int[orig.length];
        int i = orig.length - 1;
        int j = 0;
        while(i>=0){
            revers[j] = orig[i];
            i--;
            j++;
        }
        i=0;
         while (i<orig.length){
             orig[i]=revers[i];
             i++;
         }
         return orig;
    }

    public static void main(String[] args) {
	int numbers[] = {10, 13, 3, 15, -9};
        System.out.println(counter(numbers));
        System.out.println(theHighestNumber(numbers));
        System.out.println(whichPosition(numbers));
        System.out.println(createReversedCopy(numbers)[0]);
        System.out.println(createReversedCopy(numbers)[1]);
        System.out.println(createReversedCopy(numbers)[2]);
        System.out.println(createReversedCopy(numbers)[3]);
        System.out.println(createReversedCopy(numbers)[4]);

        reverse(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}
