package com.example.designpattern.FactoryDesignPattern.ShapeExample;

import com.example.designpattern.FactoryDesignPattern.ShapeExample.ConcreteCreator.ConcreteCreatorCircle;
import com.example.designpattern.FactoryDesignPattern.ShapeExample.ConcreteCreator.ConcreteCreatorSquare;
import com.example.designpattern.FactoryDesignPattern.ShapeExample.Creator.Creator;
import com.example.designpattern.FactoryDesignPattern.ShapeExample.Shape.Shape;

public class FactoryMethodMainClass {
    public static void main(String[] args) {

        Creator creator1 = new ConcreteCreatorCircle();
        Shape circle = creator1.factoryMethod();
        circle.draw();

        Creator creator2 = new ConcreteCreatorSquare();
        Shape square = creator2.factoryMethod();
        square.draw();
    }
}
