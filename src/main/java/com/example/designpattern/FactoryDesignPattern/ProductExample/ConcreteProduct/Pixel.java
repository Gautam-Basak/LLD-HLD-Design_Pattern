package com.example.designpattern.FactoryDesignPattern.ProductExample.ConcreteProduct;

import com.example.designpattern.FactoryDesignPattern.ProductExample.Product.Product;

public class Pixel implements Product {

    @Override
    public void manufacture() {
        
        System.out.println("Pixels are manufactured by Google");
    }
    
}
