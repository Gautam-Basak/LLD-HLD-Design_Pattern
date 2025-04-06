package com.example.designpattern.ShoppingCartDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.example.designpattern.ShoppingCartDesign.Strategy.DiscountStrategy;

public class CartService {

    private final Map<String, Cart> userCart = new HashMap<>();

    public Cart geCart(String userId) {
        return userCart.computeIfAbsent(userId, Cart::new);
    }

    public Order checkout(String userId, InventoryService inventoryService, DiscountStrategy strategy) {

        Cart cart = geCart(userId);
        for(CartItem item : cart.getAllItems()){
            if (!inventoryService.isAvailable(item.getProduct().getId(), item.getQuantity())) {
                throw new RuntimeException("Product out of stock: " + item.getProduct().getName());
            }
        }

        for (CartItem item : cart.getAllItems()) {
            inventoryService.reduceStock(item.getProduct().getId(), item.getQuantity());
        }

        double total = cart.getTotalCartPrice();
        double amountAfterDiscount = strategy.applyDiscount(total);

        Order order = new Order(UUID.randomUUID().toString(), userId, 
                                new ArrayList<>(cart.getAllItems()), amountAfterDiscount);

        cart.getAllItems().clear();

        return order;

    }

}
