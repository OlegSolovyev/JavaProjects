package com.company;

public class Game {
    String title;
    String genre;
    int yearOfReleased;
    Company company;

    public Game(String title, String genre, int yearOfReleased, Company company){
        this.title=title;
        this.genre=genre;
        this.yearOfReleased = yearOfReleased;
        this.company=company;
    }

    public String toString(){
        return "This game calls: "+title+"     game genre: "+genre+"      was released in "+yearOfReleased+"      was developed by the company "+ company.companyToString();
    }

    public void toStringAllGamesInYear(int year,Game games[]) {
            if (yearOfReleased == year) {
                System.out.println("This game calls: " + title + "     game genre: " + genre + "      was developed by the company " + company.companyToString());
        }
    }
}
