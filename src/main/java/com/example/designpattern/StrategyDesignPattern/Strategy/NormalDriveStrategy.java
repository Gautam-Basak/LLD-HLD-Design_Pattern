package com.example.designpattern.StrategyDesignPattern.Strategy;

// Group of classes which have Normal Drive Strategy will use this concrete strategy.
// What we did here is that, all the concrete implementation having Normal Drive
// Capability will use this NormalDriveStrategy class so that all concrete implementation
// classes doesn't have to override similar/duplicate codes.
public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }

}
