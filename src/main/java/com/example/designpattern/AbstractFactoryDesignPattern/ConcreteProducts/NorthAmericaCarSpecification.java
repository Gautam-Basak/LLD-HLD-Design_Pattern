package com.example.designpattern.AbstractFactoryDesignPattern.ConcreteProducts;

import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.CarSpecification;

public class NorthAmericaCarSpecification implements CarSpecification {

    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulation");
    }
}
