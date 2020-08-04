package com.company;

public class BookingManager {


    public static Booking addNewBooking(Room room, Person person, DateInterval dateInterval){
        return new Booking(room, person, dateInterval);
    }

    public static void editPersonName(Booking booking, String name){
        booking.setPerson(name);
    }

    public static Booking[] createBookingList(Booking[] bookings){
        return bookings;
    }

    public static void printBookingNumber(Booking booking){
        System.out.println(booking.getRoom().getNumber()+"."+booking.getDateInterval().getStart().numberDate()+"."+booking.getDateInterval().getFinish().numberDate());
    }
}
