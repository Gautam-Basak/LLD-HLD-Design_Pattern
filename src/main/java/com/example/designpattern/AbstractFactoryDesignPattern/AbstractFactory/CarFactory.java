package com.example.designpattern.AbstractFactoryDesignPattern.AbstractFactory;

import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.Car;
import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.CarSpecification;

public interface CarFactory {
    
    Car createCar();
    CarSpecification createSpecification();
}
