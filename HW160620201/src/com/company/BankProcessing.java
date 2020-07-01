package com.company;

public class BankProcessing {
    private Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts){
        this.bankAccounts=bankAccounts;
    }

    public String toString(){
        String str="Bank Accounts: \n";
        for (int i=0; i<bankAccounts.length;i++){
            str+=bankAccounts[i].toString()+ ((bankAccounts.length-1>i)?"; \n":"");
        }
        return str;
    }

    public String secureToString(){
        String str="";
        for (int i=0; i<bankAccounts.length;i++){
            str+=bankAccounts[i].secureToString()+ ((bankAccounts.length-1>i)?"; \n":"");
        }
        return str;
    }

    public double getSum(){
        int sum=0;
        for (int i=0; i<bankAccounts.length;i++){
            sum+=bankAccounts[i].getBalance();
        }
        return sum;
    }

    public Person[] getClients() {
        Person[] people= new Person[bankAccounts.length];
        for (int i=0; i<people.length;i++){
            people[i]=bankAccounts[i].getClient();
        }
        return people;
    }

    public String allPeopleToString(){
        Person[] clients= getClients();
        String str="";
        for (int i=0;i<clients.length;i++){
            str+=clients[i].toString()+"\n";
        }
        return str;
    }
}
