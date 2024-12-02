package com.example.designpattern.StrategyDesignPattern.Strategy;

// Group of classes which have this behaviour will use these strategy
// What we did here is that, all the concrete implementation having Sports Drive
// Capability will use this SportsDriveStrategy class so that all concrete implementation
// classes doesn't have to override similar/duplicate codes.
public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
    
}
