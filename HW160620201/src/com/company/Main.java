package com.company;

public class Main {

    public static void main(String[] args) {
	Person p1= new Person("John","Dorian");
	Account a1= new Account(p1,23659.18,"DE827234");
	Account a2= new Account(p1,23659.18,"DE8237234");
	Account a3= new Account(p1,23659.18,"DE82374");
	Account a4= new Account(p1,23659.18,"DE82337234");
	Account[] accounts=new Account[]{a1,a2,a3,a4};
        //System.out.println(a1.secureToString());
        BankProcessing b1= new BankProcessing(accounts);
        System.out.println(b1.secureToString());
    }
}
