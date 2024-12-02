package com.example.designpattern.NullObjectDesignPattern;

public class NullVehicle implements Vehicle {

    // The 3rd point in Info, it was mentioned that NullObject will do nothing or
    // default behavior.

    // Here we gave default behavior
    @Override
    public int getTankCapacity() {
        return 0;
    }

    // Here also we gave default behavior
    @Override
    public int getSeatCapacity() {
        return 0;
    }

}
