package com.example.designpattern.FactoryDesignPattern.ShapeExample.ConcreteCreator;

import com.example.designpattern.FactoryDesignPattern.ShapeExample.ConcreteShape.Square;
import com.example.designpattern.FactoryDesignPattern.ShapeExample.Creator.Creator;
import com.example.designpattern.FactoryDesignPattern.ShapeExample.Shape.Shape;

public class ConcreteCreatorSquare extends Creator{

    @Override
    public Shape factoryMethod() {
        return new Square();
    }
    
}
