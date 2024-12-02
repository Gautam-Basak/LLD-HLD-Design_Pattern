package com.example.designpattern.AbstractFactoryDesignPattern.ConcreteProducts;

import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.Car;

public class SedanCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }   
}
