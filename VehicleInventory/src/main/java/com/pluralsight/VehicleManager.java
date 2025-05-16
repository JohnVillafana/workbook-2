package com.pluralsight;

public class VehicleManager {
    public void addVehicle() {
        System.out.println("VehicleInventory: VehicleManager.addVehicle() executed");
    }
    
    public static void main(String[] args) {
        VehicleManager app = new VehicleManager();
        app.addVehicle();
    }
}
