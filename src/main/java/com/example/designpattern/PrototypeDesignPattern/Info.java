package com.example.designpattern.PrototypeDesignPattern;

public class Info {

    // It is a creational design pattern
    // The concept is to copy an existing object rather than creating a new object
    // from scratch specillay when object creation logic is complex also creating
    // new object may be costly.

    // Steps :
    // 1) We will create an "Interface" (here "Shape"), it also contain a reference
    // of itself.
    // 2) Next we will have Concrete Shape class (here "Circle")
    // 3) Next we will have "ShapeClient" Class (// This is like a user of shapes.It
    // uses a prototype (a shape) to create new shapes.)
}
