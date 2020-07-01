package com.company;

public class Main {

    public static double getSumOfHalves(int n){
        int i = 1;
        double rez = 0.0;
        double nextHalf=1.0;
        while(i<=n){
          nextHalf= nextHalf/2;
          rez+=nextHalf;
          i++;
        }
        return rez;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfHalves(4));
    }
}
