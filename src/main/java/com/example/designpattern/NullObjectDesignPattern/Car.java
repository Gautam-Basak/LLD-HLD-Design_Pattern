package com.example.designpattern.NullObjectDesignPattern;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 48;
    }

    @Override
    public int getSeatCapacity() {
        return 5;
    }
    
}
