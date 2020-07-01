package com.company;

public class Account {
    private String IBAN;
    private Person client;
    private double balance;

    public Account(Person client, double balance, String IBAN){
        this.client=client;
        this.balance=balance;
        this.IBAN=IBAN;
    }

    public String toString(){
        return "Client Name: "+client+"   Client's Balance: "+balance+"   IBAN: "+IBAN;
    }

    public String secureToString(){
        return "Client Name: "+client+"   Client's Balance: "+balance+"   IBAN: "+securedIBAN();
    }

    private String securedIBAN(){
        if (IBAN.length()>6) {
            String str = IBAN.substring(0,4);
            for (int i=0;i<IBAN.length()-6;i++, str += "*");
            str+= IBAN.substring(IBAN.length()-2,IBAN.length());
            return str;
        }else {
            return IBAN;
        }
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public String getIBAN() {
        return IBAN;
    }
}
