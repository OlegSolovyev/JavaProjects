package com.company;

public class Main {

    public static void areTheyShorterThen5(String str[]){
        int i = 0;
        while(i<str.length){
            if (str[i].length()<5){
                System.out.println(str[i]);
            }
            i++;
        }
    }

    public static void checkList(String[] areHere, String[] all){
        int i = 0;
        while(i<all.length){
            if (isNameThere(areHere,all[i])){
                System.out.println(all[i] + " is here");
            }else {
                System.out.println(all[i] + " isn't here");
            }
            i++;
        }
    }

    public static boolean isNameThere(String str[], String yourName){
        int i = 0;
        while(i<str.length) {
            if (str[i].equals(yourName)) {
                return true;
            }
            i++;
        }
        return false;

    }

    public static int whichPosition(String str[], String yourName){
        int i = 0;
        while(i<str.length) {
            if (str[i].equals(yourName)) {
                return i;
            }
            i++;
        }
        return -1;

    }

    public static void main(String[] args) {
	String names[] = {"Valeriya","Inna","Nickolaus","Jack"};
	String names2[] = {"Valeriya", "Luck", "Greg","Inna","Nickolaus","Jack","Peter"};
	checkList(names,names2);
	//areTheyShorterThen5(names);
     //   System.out.println(isNameThere(names,"Jack"));
       // System.out.println(whichPosition(names,"Inna"));
    }
}
