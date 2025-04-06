package com.example.designpattern.ShoppingCartDesign;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private final Map<String, Integer> inventory = new HashMap<>();

    public void addStock(String productId, int quantity) {
        inventory.put(productId, inventory.getOrDefault(productId, 0) + quantity);
    }

    public boolean isAvailable(String productId, int required) {
        return inventory.get(productId) >= required;
    }

    public void reduceStock(String productId, int quantity){
        inventory.put(productId, inventory.get(productId) - quantity);
    }
}
