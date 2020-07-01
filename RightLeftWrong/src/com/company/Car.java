package com.company;

public class Car {
    String brand;
    double price;

    public String toString(){
        return  "car: " + brand + " price: " + price;
    }

    public Car(String brand, double price){
        this.price=price;
        this.brand=brand;
    }

    public int compareTo(Car car){
       if(this.price>car.price) return 1;
       if(this.price<car.price) return -1;
       return 0;
    }
}
