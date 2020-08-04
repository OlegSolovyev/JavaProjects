package com.company;

import java.util.Random;

public class DateInterval {
    private Date start;
    private Date finish;
    private Random rnd = new Random(System.currentTimeMillis());
    private int days;

    public DateInterval(Date start, Date finish) {
        this.start = start;
        this.finish = finish;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    public int getDays(){
        days=0;
        if (start.getYear()!=finish.getYear()){
            int counter=0;
            int[] years= new int[finish.getYear()-start.getYear()];
            for (int j=0; j<years.length;j++){
                years[j]=start.getYear()+1+j;
            }
            for (int i=0; i<years.length; i++){
                if (years[i]%400==0||((years[i]%100!=0)&&(years[i]%4==0))){
                    counter++;
                }
            }
            days+=years.length*365+counter;
        }
        int minusDays=0;
        for (int i=1;i<=start.getMonth();i++){
            if((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12)) {
                minusDays+= 31;
            } else {
                if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {
                    minusDays += 30;
                } else {
                    if (i==2){
                        minusDays+=(start.getYear()%400==0||((start.getYear()%100!=0)&&(start.getYear()%4==0)))? 29: 28;
                    } else {
                        return -1;
                    }
                }
            }
        }
        int addDays=0;
        for (int i=1;i<=finish.getMonth();i++){
            if((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12)) {
                addDays+= 31;
            } else {
                if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {
                    addDays += 30;
                } else {
                    if (i==2){
                        addDays+=(start.getYear()%400==0||((start.getYear()%100!=0)&&(start.getYear()%4==0)))? 29: 28;
                    } else {
                        return -1;
                    }
                }
            }
        }
        days=days-minusDays-start.getDay()+addDays+finish.getDay();
        return days;
    }

    @Override
    public String toString() {
        return "[" + start +
                ';' + finish +
                ']';
    }
}
