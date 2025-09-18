package com.example.designpattern.StrategyDesignPattern.VehicleExample;

import com.example.designpattern.StrategyDesignPattern.VehicleExample.ConcreteStrategyImplementation.SpecialVehicle;
import com.example.designpattern.StrategyDesignPattern.VehicleExample.ConcreteStrategyImplementation.SportsVehicle;

public class MainClass {
    public static void main(String[] args) {

        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new SpecialVehicle();
        vehicle2.drive();
    }
}
