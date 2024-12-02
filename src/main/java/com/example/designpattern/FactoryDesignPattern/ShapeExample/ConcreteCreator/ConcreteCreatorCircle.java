package com.example.designpattern.FactoryDesignPattern.ShapeExample.ConcreteCreator;

import com.example.designpattern.FactoryDesignPattern.ShapeExample.ConcreteShape.Circle;
import com.example.designpattern.FactoryDesignPattern.ShapeExample.Creator.Creator;
import com.example.designpattern.FactoryDesignPattern.ShapeExample.Shape.Shape;

public class ConcreteCreatorCircle extends Creator{

    @Override
    public Shape factoryMethod() {
        return new Circle();
    }
    
}
