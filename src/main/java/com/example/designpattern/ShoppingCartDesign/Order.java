package com.example.designpattern.ShoppingCartDesign;

import java.util.List;

public class Order {
    private final String orderId;
    private final String userId;
    private final List<CartItem> items;
    private final double totalPrice;

    public Order(String orderId, String userId, List<CartItem> items, double totalPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    
}
