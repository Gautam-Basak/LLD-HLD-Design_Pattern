package com.example.designpattern.ShoppingCartDesign.Strategy;

public class NoDiscountConcreteStrategy implements DiscountStrategy{

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount;
    }
    
}
