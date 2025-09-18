package com.example.designpattern.StrategyDesignPattern.VehicleExample.Strategy;

// Group of classes which have this behaviour will use these strategy
// What we did here is that, all the concrete implementation having Special Drive
// Capability will use this SpecialDriveStrategy class so that all concrete implementation
// classes doesn't have to override similar/duplicate codes. 
public class SpecialDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {    
        System.out.println("Special Drive Capability");
    }
    
}
