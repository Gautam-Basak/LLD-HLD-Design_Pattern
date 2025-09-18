package com.example.designpattern.StrategyDesignPattern.VehicleExample.ConcreteStrategyImplementation;

import com.example.designpattern.StrategyDesignPattern.VehicleExample.Strategy.SportsDriveStrategy;
import com.example.designpattern.StrategyDesignPattern.VehicleExample.Vehicle;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
    
}
