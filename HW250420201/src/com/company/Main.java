package com.company;

public class Main {

    public static boolean CheckMonth( int month){
        boolean m = ((month>0) && (month<13));
        if (m){
            System.out.println(getStringMonth(month));
        } else {
            System.out.println("ERROR");
        }
        return m;

    }

    public static String getStringMonth(int month1){
        int a = 12;
        if (month1 == a){
            return "December";
        } else {
            if (month1 == a-1){
                return "November";
            } else {
                if (month1 == a-2) {
                    return "October";
                } else {
                    if (month1 == a-3){
                        return "September";
                    } else {
                        if (month1 == a-4){
                            return "August";
                        } else {
                            if (month1 == a-5){
                                return "July";
                            } else {
                                if (month1 == a-6){
                                    return "June";
                                } else {
                                    if (month1 == a-7){
                                        return "Mai";
                                    } else {
                                        if (month1 == a-8){
                                            return "April";
                                        } else {
                                            if (month1 == a-9){
                                                return "March";
                                            } else {
                                                if (month1 == a-10){
                                                    return "February";
                                                } else {
                                                    if (month1 == a-11){
                                                        return "January";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "0";
    }

    public static void main(String[] args) {
        int a = 10;
        boolean s = CheckMonth(a);
        System.out.println(s);
    }
}
