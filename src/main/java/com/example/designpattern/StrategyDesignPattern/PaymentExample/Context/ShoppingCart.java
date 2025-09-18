package com.example.designpattern.StrategyDesignPattern.PaymentExample.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.StrategyDesignPattern.PaymentExample.Item;
import com.example.designpattern.StrategyDesignPattern.PaymentExample.Strategy.PaymentStrategy;


public class ShoppingCart {


    private List<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
        System.out.println("Checkout completed successfully!");
    }
}
