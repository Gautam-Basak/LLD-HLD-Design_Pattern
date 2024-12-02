package com.example.designpattern.ObserverDesignPattern.WeatherAppExample.Subject;

import com.example.designpattern.ObserverDesignPattern.WeatherAppExample.Observer.Observer;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
