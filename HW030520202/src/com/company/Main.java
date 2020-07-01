package com.company;

public class Main {

    public static void setRadioStation(double frequency){
        System.out.println("приёмник работает на частоте " + frequency);
    }

    public static void keyHandler(int key){
        switch (key){
            case 1:
                setRadioStation(105.3);
                break;
            case 2:
                setRadioStation(186.1);
                break;
            case 3:
                setRadioStation(207.7);
                break;
            case 4:
                setRadioStation(166.8);
                break;
            case 5:
                setRadioStation(222.2);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    public static void main(String[] args) {
	keyHandler(5);
    }
}
