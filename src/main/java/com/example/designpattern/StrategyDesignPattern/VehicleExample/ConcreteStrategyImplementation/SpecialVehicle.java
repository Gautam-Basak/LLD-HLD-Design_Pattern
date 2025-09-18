package com.example.designpattern.StrategyDesignPattern.VehicleExample.ConcreteStrategyImplementation;

import com.example.designpattern.StrategyDesignPattern.VehicleExample.Strategy.SpecialDriveStrategy;
import com.example.designpattern.StrategyDesignPattern.VehicleExample.Vehicle;

public class SpecialVehicle extends Vehicle{
    
    public SpecialVehicle(){
        super(new SpecialDriveStrategy());
    }
}
