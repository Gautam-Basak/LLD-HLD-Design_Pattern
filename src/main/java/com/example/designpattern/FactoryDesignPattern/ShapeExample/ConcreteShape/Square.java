package com.example.designpattern.FactoryDesignPattern.ShapeExample.ConcreteShape;

import com.example.designpattern.FactoryDesignPattern.ShapeExample.Shape.Shape;

public class Square extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
    
}
