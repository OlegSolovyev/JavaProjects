package com.company;

public class Main {



    public static boolean areBracketsRight(String str){
        int j = 0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == '('){
                j=j+1;
            }
            if (str.charAt(i) == ')'){
                j=j-1;
            }
            if (j<0){
                return false;
            }
        }
        return (j==0);
    }

    public static void main(String[] args) {
        String str="9*(8+3)-( (9+1)*5)";
        String str1="9*(8+3)- (9+1)*5)";
        String str2="9*8+3)-( (9+1)*5";
        System.out.println(areBracketsRight(str));
        System.out.println(areBracketsRight(str1));
        System.out.println(areBracketsRight(str2));
    }
}
