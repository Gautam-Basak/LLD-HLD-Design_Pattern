package com.example.designpattern.StrategyDesignPattern.PaymentExample.ConcreteStrategies;

import com.example.designpattern.StrategyDesignPattern.PaymentExample.Strategy.PaymentStrategy;

public class CryptoPayment implements PaymentStrategy {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with cryptocurrency");
    }
}
