package com.example.designpattern.NullObjectDesignPattern;

public class MainClient {
    public static void main(String[] args) {
        
        Vehicle vehicle = FactoryVehicle.getVehicleObject("null");

        System.out.println("Tank Capacity " + vehicle.getTankCapacity());
        System.out.println("Seat Capacity " + vehicle.getSeatCapacity()); 
    }
}
