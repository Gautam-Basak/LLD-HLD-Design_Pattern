package com.example.designpattern.StrategyDesignPattern;

import com.example.designpattern.StrategyDesignPattern.ConcreteStrategyImplementation.SpecialVehicle;
import com.example.designpattern.StrategyDesignPattern.ConcreteStrategyImplementation.SportsVehicle;

public class MainClass {
    public static void main(String[] args) {

        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new SpecialVehicle();
        vehicle2.drive();
    }
}
