package com.example.designpattern.ObserverDesignPattern.WeatherAppExample;

import com.example.designpattern.ObserverDesignPattern.WeatherAppExample.ConcreteObserver.PhoneDisplay;
import com.example.designpattern.ObserverDesignPattern.WeatherAppExample.ConcreteObserver.TvDisplay;
import com.example.designpattern.ObserverDesignPattern.WeatherAppExample.ConcreteSubject.WeatherStation;
import com.example.designpattern.ObserverDesignPattern.WeatherAppExample.Observer.Observer;

public class MainClass {
    public static void main(String[] args) {
        
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneObserver = new PhoneDisplay();
        Observer tvObserver = new TvDisplay();

        weatherStation.addObserver(phoneObserver);
        weatherStation.addObserver(tvObserver);

        weatherStation.setWeather("Sunny");
    }
}
