package com.example.designpattern.FactoryDesignPattern;

public class Technique {
    
    // It come under Creational Design Pattern.
    // When we need to create Objects of classes based on conditions we usually follow
    // this design pattern.

    // I saw most of the article follow two ways to achieve this pattern -

    // 1st - After creating "Factory Class", inside that we will have a method whose
    // return type is of type Product and will have parameter of type String and based 
    // on the input string we will return different implementation of Product.
    // The input string will be provided at runtime.

    // 2nd - Here the Factory Class will be be abstrat class or interface and multiple
    // concrete factory class will extends/implements factory interface/abstract class
    // and the overridden method return different concrete implementation class of
    // product.
    // B3380915
}
