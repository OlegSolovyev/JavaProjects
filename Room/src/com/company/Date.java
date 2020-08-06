package com.company;

public class Date implements Comparable<Date>{
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day +
                "-" + month +
                "-" + year
                ;
    }

    public String numberDate(){
        return day+""+month+""+year;
    }

    @Override
    public int compareTo(Date o) {
        return (this.day+this.month*100+this.year*10000)-(o.day+o.month*100+o.year*10000);
    }
}
