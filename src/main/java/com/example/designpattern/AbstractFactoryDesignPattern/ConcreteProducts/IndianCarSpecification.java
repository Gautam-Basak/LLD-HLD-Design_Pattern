package com.example.designpattern.AbstractFactoryDesignPattern.ConcreteProducts;

import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.CarSpecification;

public class IndianCarSpecification implements CarSpecification{

    @Override
    public void display() {
        System.out.println("Indian Car Specification: Safety features compliant with local regulation");
    }   
}
