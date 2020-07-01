package com.company;

public class Main {

    public static String printResult(int code){
        String ErrorMessage="";
        switch (code){
            case 301:
                ErrorMessage="работа метода прервана";
                break;
            case 200:
                ErrorMessage="ошибок не найдено";
                break;
            case 400:
                ErrorMessage="неверный запрос";
                break;
            case 404:
                ErrorMessage="страница не найдена";
                break;
            case 505:
                ErrorMessage="внутренняя ошибка метода";
                break;
            default:
                ErrorMessage="UNKNOWN ERROR";
                break;
        }
        return ErrorMessage;
    }


    public static void main(String[] args) {
	System.out.println(printResult(200));
    }
}
