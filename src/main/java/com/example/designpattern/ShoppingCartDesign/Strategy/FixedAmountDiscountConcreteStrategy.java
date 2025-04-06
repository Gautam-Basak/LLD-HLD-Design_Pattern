package com.example.designpattern.ShoppingCartDesign.Strategy;

public class FixedAmountDiscountConcreteStrategy implements DiscountStrategy{

    private final double discountAmount;

    public FixedAmountDiscountConcreteStrategy(double discountAmount){
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return Math.max(0, totalAmount - discountAmount);
    }
    
}
