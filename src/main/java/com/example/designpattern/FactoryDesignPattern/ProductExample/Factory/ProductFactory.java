package com.example.designpattern.FactoryDesignPattern.ProductExample.Factory;

import com.example.designpattern.FactoryDesignPattern.ProductExample.ConcreteProduct.Iphone;
import com.example.designpattern.FactoryDesignPattern.ProductExample.ConcreteProduct.Pixel;
import com.example.designpattern.FactoryDesignPattern.ProductExample.Product.Product;

public class ProductFactory {
    
    public static Product manufactureProduct(String product){

        if(product == null){
            return null;
        }
        if (product.equalsIgnoreCase("Pixel")) {
            return new Pixel();
        }else if (product.equalsIgnoreCase("Iphone")) {
           return new Iphone(); 
        }
        return null;
    }
}
