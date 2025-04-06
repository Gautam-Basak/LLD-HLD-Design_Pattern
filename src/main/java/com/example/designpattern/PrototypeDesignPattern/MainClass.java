package com.example.designpattern.PrototypeDesignPattern;

public class MainClass {
    
    public static void main(String[] args) {
        
        Shape redCircle = new Circle("Red");
        // Here Fist time we are creating the object
        redCircle.draw();

        // Now if client want to create same object next time then 
        ShapeClient client = new ShapeClient(redCircle);
        Shape redCircle2 = client.createShape();
        redCircle2.draw();
        

    }
}
