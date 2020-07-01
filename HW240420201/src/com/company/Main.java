package com.company;

public class Main {

    public static void PrintDate(int day, int month, int year, String sp) {
        if (((day > 0) & (day < 32)) & ((month > 0) & (month < 13))) {
            if (day > 9) {
                if (month > 9) {
                    System.out.println(day + sp + month + sp + year);
                } else {
                    System.out.println(day + sp + "0" + month + sp + year);
                }
            } else {
                if (month > 9) {
                    System.out.println("0" + day + sp + month + sp + year);

                } else {
                    System.out.println("0" + day + sp + "0" + month + sp + year);
                }
            }
        } else {
            System.out.println("ERROR, WRONG DATE");
        }
    }

    public static boolean isLeap (int year){
        return ((year % 4 == 0)&&(year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        PD(5, 8, 2004, "/");
        String monthString = getStringMonth(2);
        System.out.println(monthString);
        System.out.println(checkDiv(1, 0));

        // && - and    || - or    ! - not     ^ - xor
    }

    public static void PD(int day, int month, int year, String sp) {
        String rez = "";
        if (day < 10) {
            rez = rez + "0" + day;
        } else {
            rez = rez + day;
        }
        rez = rez + sp;
        if (month < 10) {
            rez = rez + "0" + month;
        } else {
            rez = rez + day;
        }
        rez = rez + sp + year;
        System.out.println(rez);
    }

    public static String getStringMonth(int month) {
        String monthString = "";
        if (month == 1) {
            monthString = "January";
        }
        if (month == 2) {
            monthString = "February";
        }
        if (month == 3) {
            monthString = "March";
        }
        if (month == 4) {
            monthString = "April";
        }
        return monthString;
    }

    public static boolean checkDiv(int a, int b) {
        return ((b != 0) && (a % b) == 0);
    }
}
