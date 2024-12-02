package com.example.designpattern.FactoryDesignPattern.ProductExample;

import com.example.designpattern.FactoryDesignPattern.ProductExample.Factory.ProductFactory;
import com.example.designpattern.FactoryDesignPattern.ProductExample.Product.Product;

public class MainClass {
    public static void main(String[] args) {
        
        Product pixel = ProductFactory.manufactureProduct("pixel");
        pixel.manufacture();

        Product iphone = ProductFactory.manufactureProduct("iphone");
        iphone.manufacture();
    }
}
