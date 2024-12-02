package com.example.designpattern.AbstractFactoryDesignPattern.ConcreteFactories;

import com.example.designpattern.AbstractFactoryDesignPattern.AbstractFactory.CarFactory;
import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.Car;
import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.CarSpecification;
import com.example.designpattern.AbstractFactoryDesignPattern.ConcreteProducts.NorthAmericaCarSpecification;
import com.example.designpattern.AbstractFactoryDesignPattern.ConcreteProducts.SedanCar;

public class NorthAmericaCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new SedanCar();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaCarSpecification();
    }
    
}
