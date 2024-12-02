package com.example.designpattern.StrategyDesignPattern;

import com.example.designpattern.StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
