package com.example.designpattern.DesignParkingLot.ObserverPattern.ConcreteObserver;

import com.example.designpattern.DesignParkingLot.ObserverPattern.Observer;

public class DisplayBoard implements Observer{

    private String message;

    @Override
    public void update(String msg) {
        this.message = msg;
        System.out.println("DisplayBoard updated: " + message);
    }   
}
