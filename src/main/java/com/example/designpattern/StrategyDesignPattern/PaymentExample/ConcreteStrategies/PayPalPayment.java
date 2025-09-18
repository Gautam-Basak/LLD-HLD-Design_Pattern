package com.example.designpattern.StrategyDesignPattern.PaymentExample.ConcreteStrategies;

import com.example.designpattern.StrategyDesignPattern.PaymentExample.Strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}
