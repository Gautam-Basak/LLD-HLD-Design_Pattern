package com.example.designpattern.AbstractFactoryDesignPattern;

import com.example.designpattern.AbstractFactoryDesignPattern.AbstractFactory.CarFactory;
import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.Car;
import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.CarSpecification;
import com.example.designpattern.AbstractFactoryDesignPattern.ConcreteFactories.IndianCarFactory;
import com.example.designpattern.AbstractFactoryDesignPattern.ConcreteFactories.NorthAmericaCarFactory;

public class MainClass {
    public static void main(String[] args) {
        
        CarFactory northAmeCarFactory = new NorthAmericaCarFactory();
        Car northAmCar = northAmeCarFactory.createCar();
        CarSpecification northAmeCarSpec = northAmeCarFactory.createSpecification();

        northAmCar.assemble();
        northAmeCarSpec.display();

        CarFactory indianCarFactory = new IndianCarFactory();
        Car indianCar = indianCarFactory.createCar();
        CarSpecification indianCarSpec = indianCarFactory.createSpecification();

        indianCar.assemble();
        indianCarSpec.display();
    }
}
