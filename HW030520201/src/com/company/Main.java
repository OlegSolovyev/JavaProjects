package com.company;

public class Main {

    public static String weekDay(int day){
        String StringDay="";
        switch (day){
            case 1:
                StringDay="Monday";
                break;
            case 2:
                StringDay="Tuesday";
                break;
            case 3:
                StringDay="Wednesday";
                break;
            case 4:
                StringDay="Thursday";
                break;
            case 5:
                StringDay="Friday";
                break;
            case 6:
                StringDay="Saturday";
                break;
            case 7:
                StringDay="Sunday";
                break;
            default:
                StringDay="ERROR";
                break;
        }
        return StringDay;
    }

    public static void main(String[] args) {
	System.out.println(weekDay(1));
    }
}
