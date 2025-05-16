package com.pluralsight;

public class TheaterReservations {
    public void execute() {
        System.out.println("TheaterReservations: TheaterReservations.execute() executed");
    }
    
    public static void main(String[] args) {
        TheaterReservations app = new TheaterReservations();
        app.execute();
    }
}
