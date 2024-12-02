package com.example.designpattern.AbstractFactoryDesignPattern.ConcreteProducts;

import com.example.designpattern.AbstractFactoryDesignPattern.AbstractProducts.Car;

public class TataCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Assembling Tata car.");
    }   
}
