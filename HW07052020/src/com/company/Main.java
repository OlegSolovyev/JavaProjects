package com.company;

public class Main {

	public static void printLineNTimes(String a,int b){
		while (b>0){
			System.out.println(a);
			b--;
		}
	}

	public static String start(){
		int a = 5;
		while (a>0){
			System.out.println(a);
			a--;
		}
		return "start";
	}

	public static String word(int a){
		switch (a){
			case 5:
				return "five";
			case 4:
				return "four";
			case 3:
				return "three";
			case 2:
				return "two";
			case 1:
				return "one";
			case 0:
				return "start";
			default:
				return "ERROR";
		}
	}

	public static void meaning(){
		int a=5;
		while (a>=0){
			System.out.println(word(a));
			a--;
		}
	}

    public static void main(String[] args) {
		printLineNTimes("Hi",1);
		System.out.println(start());
		meaning();
    }
}
