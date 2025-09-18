package com.example.designpattern.StrategyDesignPattern.PaymentExample;

import com.example.designpattern.StrategyDesignPattern.PaymentExample.ConcreteStrategies.CreditCardPayment;
import com.example.designpattern.StrategyDesignPattern.PaymentExample.ConcreteStrategies.CryptoPayment;
import com.example.designpattern.StrategyDesignPattern.PaymentExample.ConcreteStrategies.PayPalPayment;
import com.example.designpattern.StrategyDesignPattern.PaymentExample.Context.ShoppingCart;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Add items to cart
        cart.addItem(new Item("Laptop", 1000));
        cart.addItem(new Item("Mouse", 50));
        
        // Payment with credit card
        cart.setPaymentStrategy(new CreditCardPayment(
            "John Doe", "1234-5678-9012-3456", "123", "12/25"
        ));
        cart.checkout();
        
        System.out.println("---");
        
        // Payment with PayPal
        cart.setPaymentStrategy(new PayPalPayment("john@example.com", "password123"));
        cart.checkout();
        
        System.out.println("---");
        
        // Payment with cryptocurrency
        cart.setPaymentStrategy(new CryptoPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout();
    }
}
