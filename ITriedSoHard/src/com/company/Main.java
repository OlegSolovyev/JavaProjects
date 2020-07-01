package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void printVert(String str){
        for (int i=str.length()-1;i>=0; i--){
            if (str.charAt(i) != ' '){
                System.out.println(str.charAt(i));
            }
        }
    }

    public static String toUpperCase(String str){
        String rez="";
        for (int i=0;i<str.length(); i++){
            char c= str.charAt(i);
            if(c >=1072 && c <=1103){
                c=(char)(c-32);
            }
            if(c==1105){
                c=(char)(c-80);
            }

            rez=rez + (c);

        }
        return rez;
    }

    public static void main(String[] args) {
	String str= "Добро пожаловать в ад, ёжик!!!";
        //printVert(str);
        System.out.println(toUpperCase(str));
    }
}
