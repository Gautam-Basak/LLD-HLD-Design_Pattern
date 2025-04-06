package com.example.designpattern.ShoppingCartDesign.Strategy;

public class PercentageDiscountConcreteStrategy implements DiscountStrategy{

    private final double percentage;

    public PercentageDiscountConcreteStrategy(double percentage) {
        this.percentage = percentage;
    } 

    @Override
    public double applyDiscount(double totalAmount) {
       return totalAmount - (totalAmount * percentage) / 100;
    }
    
}
