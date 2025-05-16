package com.pluralsight;

public class PhoneService {
    public void dial() {
        System.out.println("CellPhoneService: PhoneService.dial() executed");
    }
    
    public static void main(String[] args) {
        PhoneService app = new PhoneService();
        app.dial();
    }
}
