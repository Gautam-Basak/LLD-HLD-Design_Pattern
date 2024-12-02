package com.example.designpattern.FactoryDesignPattern.ProductExample.ConcreteProduct;

import com.example.designpattern.FactoryDesignPattern.ProductExample.Product.Product;

public class Iphone implements Product {

    @Override
    public void manufacture() {

        System.out.println("Iphones are manufactured by Apple");
    }
    
}
