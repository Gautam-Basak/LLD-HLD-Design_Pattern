package com.example.designpattern.NullObjectDesignPattern;

public class FactoryVehicle {

    static Vehicle getVehicleObject(String vehicleType) {

        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } 
        else {
            // Previouly before implementing Null Object Design Pattern we use to
            // return "null" but as we mentioned in the Info, point no. 1 i.e
            // "NullObject replaces null return type"
            
            // return null;
            return new NullVehicle();
        }
    }
}
