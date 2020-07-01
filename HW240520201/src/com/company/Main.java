package com.company;

public class Main {

    public static void cruiseControlHandler(){
        double wishSpeed = 60.0;
        System.out.println("Current Speed: " + getCurrentSpeed());
        System.out.println("Current Power: " + getCurrentPower());
        System.out.println("Wish Speed: " + wishSpeed);
        if ((getCurrentSpeed()>wishSpeed) && ((getCurrentSpeed()-wishSpeed)>(wishSpeed*0.03))){
            decreasePower(wishSpeed);
            return;
        }
        if ((getCurrentSpeed()<wishSpeed) && ((wishSpeed-getCurrentSpeed())>(wishSpeed*0.03))){
            increasePower(wishSpeed);
            return;
        }
        System.out.println("Power is ok");
    }

    public static double getCurrentSpeed(){
        return 89.5;
    }

    public static int getCurrentPower(){
        return 56;
    }

    public static void increasePower(double wishSpeed){
        int newPower= (int) (getCurrentPower()*(wishSpeed/getCurrentSpeed()));
        System.out.println("New Power: " + newPower);
    }

    public static void decreasePower(double wishSpeed){
        int newPower= (int) (getCurrentPower()*(wishSpeed/getCurrentSpeed()));
        System.out.println("New Power: " + newPower);
    }

    public static void main(String[] args) {
	cruiseControlHandler();
    }
}
