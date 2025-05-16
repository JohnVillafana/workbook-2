package com.pluralsight;

public class RollTheDice {
    public void execute() {
        System.out.println("RollTheDice: RollTheDice.execute() executed");
    }
    
    public static void main(String[] args) {
        RollTheDice app = new RollTheDice();
        app.execute();
    }
}
