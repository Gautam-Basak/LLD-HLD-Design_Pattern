package com.example.designpattern.AbstractFactoryDesignPattern.ConcreteFactories;

import com.example.designpattern.AbstractFactoryDesignPattern.AbstractFactory.CarFactory;
import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.Car;
import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.CarSpecification;
import com.example.designpattern.AbstractFactoryDesignPattern.ConcreteProducts.IndianCarSpecification;
import com.example.designpattern.AbstractFactoryDesignPattern.ConcreteProducts.TataCar;

public class IndianCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new TataCar();
    }

    @Override
    public CarSpecification createSpecification() {
        return new IndianCarSpecification();
    }
    
}
