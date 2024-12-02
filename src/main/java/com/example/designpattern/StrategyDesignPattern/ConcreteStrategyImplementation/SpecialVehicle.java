package com.example.designpattern.StrategyDesignPattern.ConcreteStrategyImplementation;

import com.example.designpattern.StrategyDesignPattern.Vehicle;
import com.example.designpattern.StrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class SpecialVehicle extends Vehicle{
    
    public SpecialVehicle(){
        super(new SpecialDriveStrategy());
    }
}
