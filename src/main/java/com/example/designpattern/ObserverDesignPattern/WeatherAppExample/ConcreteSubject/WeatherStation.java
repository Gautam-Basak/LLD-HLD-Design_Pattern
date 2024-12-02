package com.example.designpattern.ObserverDesignPattern.WeatherAppExample.ConcreteSubject;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.ObserverDesignPattern.WeatherAppExample.Observer.Observer;
import com.example.designpattern.ObserverDesignPattern.WeatherAppExample.Subject.Subject;

public class WeatherStation implements Subject {

    List<Observer> observers = new ArrayList<>();
    String weather;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        
        for(Observer observer : observers){
            observer.update(weather);
        }
    }
    
    public void setWeather(String newWeather){
        this.weather = newWeather;
        notifyObserver();
    }
}
