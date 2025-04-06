package com.example.designpattern.PrototypeDesignPattern;

public class ShapeClient {

    private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype){
        this.shapePrototype = shapePrototype;
    }
    
    // This method creates a new shape using the prototype.
    public Shape createShape() {
        return shapePrototype.clone();
    }
}
