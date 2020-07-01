package com.company;

public class Main {

    public static String revers(String str){
        String rez="";
        for (int i=(str.length()-1);i>=0;i--){
            rez=rez + str.charAt(i);
        }
        return rez;
    }

    public static void main(String[] args) {
        String str="I would like to eat pizza";
        System.out.println(revers(str));
    }
}
