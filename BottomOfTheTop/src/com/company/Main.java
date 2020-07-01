package com.company;

public class Main {
    
    public static boolean  isPrime(int i){
        int j=i-1;
        while (j>1){
            if (i%j==0){
                return false;
            }else {
                j--;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int start, int finish){

        for(int i = (start<finish)? start: finish;i <= ((start>finish)? start: finish); i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(1,2000000);

    }
}
