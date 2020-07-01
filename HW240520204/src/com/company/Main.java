package com.company;

public class Main {

    public static void printInColumn(String str){
        int i=0;
        while (i<str.length()){
            System.out.print(str.charAt(i));
            if (str.charAt(i) == ' ') {
                System.out.println();
            }
            i++;
        }
    }

    public static void main(String[] args) {
	printInColumn("Hello, What's up? But wait, who cares?");
    }
}
