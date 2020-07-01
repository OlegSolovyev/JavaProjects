package com.company;

public class Main {

    public static void main(String[] args) {
    Company c1= new Company("Bethesda Game Studios");
    Company c2= new Company("Nival Interactive");
    Company c3= new Company("Blizzard Entertainment");
	Game g1= new Game("The Elder Scrolls V: Skyrim","Action role-playing",2011,c1);
	Game g2= new Game("Heroes of might and magic V","Turn-based strategy, role-playing",2006,c2);
	Game g3= new Game("Hearthstone","Digital collectible card game",2014,c3);
	Game g4= new Game("Warcraft III: The Frozen Throne","Real-time strategy",2003,c3);
        Game games[]={g1,g2,g3,g4};
        for (int i =0;i<games.length;i++){
            System.out.println(games[i].toString());
        }
        System.out.println("----------------------------------");
        for (int i =0;i<games.length;i++){
            games[i].toStringAllGamesInYear(2006,games);
        }


    }
}
