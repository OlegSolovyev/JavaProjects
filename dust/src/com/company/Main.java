package com.company;

public class Main {

    public static void GG(int a){
        if(a==0){
            System.out.println("Pizza Time!☺");
        } else {
            ++a;
            System.out.println(a);
            GG(a);
        }
    }
    
    public static boolean dateVal(int day, int month, int year){
        return isYearCor(year) &&
                isMonthCor(month) &&
                  isDayCor(day, month, year);
    }

    public static boolean isMonthCor(int month) {
        return month>=1 && month<=12;
    }

    public static boolean isYearCor(int year) {
        return year >= 0;
    }

    public static boolean isDayCor(int day, int month, int year) {
        if ((day>=1)&&(day<=28)){return true;}
        return day>=1&&day<=getDayPerMonth(month,year);
    }

    public static int getDayPerMonth(int month, int year) {
        if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
            return 31;
        }
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)){
            return 30;
        }
        return 28+addDayIfYearLeap(year);
    }

    public static boolean isYearLeap(int year){
        return ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0));

    }

    public static int addDayIfYearLeap(int year) {
        if (isYearLeap(year)){
            return 1;
        } else {
         return 0;
        }
    }

    public static void main(String[] args) {
	//GG(-10);
    //    int k = 2;
        //   System.out.println(k++ + " is k");
        System.out.println(dateVal(29,2,2000));
        System.out.println((getStringMonth(3)));
        System.out.println((getStringMonth(6)));
        System.out.println((getStringMonth(0)));

    }
    // switch(){
    //     case sowp1:
    //           com11;
    //           com21;
    //           break;
    //     case sowp2:
    //           com12;
    //           com22;
    //           break;
    //     default:
    //           com;
    //           com;
    //           break;
    //}
    public static String getStringMonth(int month){
        String stringMonth="";
        switch (month){
            case 1:
                stringMonth = "January";
                break;

            case 2:
                stringMonth = "February";
                break;

            case 3:
                stringMonth = "March";
                break;

            case 4:
                stringMonth = "April";
                break;

            case 5:
                stringMonth = "Mai";
                break;

            case 6:
                stringMonth = "June";
                break;

            case 7:
                stringMonth = "July";
                break;

            case 8:
                stringMonth = "August";
                break;

            case 9:
                stringMonth = "September";
                break;

            case 10:
                stringMonth = "October";
                break;

            case 11:
                stringMonth = "November";
                break;

            case 12:
                stringMonth = "December";
                break;

            default:
                stringMonth = "ERROR";
                break;



        }
        return stringMonth;
    }
}
