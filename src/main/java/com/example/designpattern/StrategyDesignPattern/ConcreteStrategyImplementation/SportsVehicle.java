package com.example.designpattern.StrategyDesignPattern.ConcreteStrategyImplementation;

import com.example.designpattern.StrategyDesignPattern.Vehicle;
import com.example.designpattern.StrategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
    
}
