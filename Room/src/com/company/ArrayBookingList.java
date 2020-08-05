package com.company;

public class ArrayBookingList implements BookingList{
    private Booking[] bookings;
    private  int size=0;
    private int capacity=3;

    public ArrayBookingList(int capacity) {
        this.capacity = capacity;
        bookings= new Booking[this.capacity];
    }

    @Override
    public void add(Booking booking) {
        if (size<capacity){
            bookings[size++]=booking;
        } else {
            capacity*=2;
            Booking[] temp=new Booking[capacity];
            for (int i=0;i<bookings.length;i++){
                temp[i]=bookings[i];
            }
            bookings=temp;
            bookings[size++]=booking;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (int i=0;i<size;i++){
            System.out.println(bookings[i]);
        }
    }

    @Override
    public Booking getBookingByIndex(int index) {
        if (index<size){
            return bookings[index];
        }
        System.out.println("Not correct index");
        return null;
    }

    @Override
    public Booking find(Booking booking) {
        for (int i=0; i<size;i++){
            if (bookings[i].getRoom()==booking.getRoom()&&bookings[i].getPerson()==booking.getPerson()&&bookings[i].getDateInterval()==booking.getDateInterval()){
                System.out.println("Your booking found on index "+i);
                return bookings[i];
            }
        }
        System.out.println("Not found");
        return null;
    }
}
