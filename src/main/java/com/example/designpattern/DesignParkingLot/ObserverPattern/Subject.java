package com.example.designpattern.DesignParkingLot.ObserverPattern;

public interface Subject {
    
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
