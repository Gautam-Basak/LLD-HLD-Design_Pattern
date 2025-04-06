package com.example.designpattern.ShoppingCartDesign;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    private final String userId;
    private final Map<String, CartItem> items = new HashMap<>();

    public Cart(String userId) {
        this.userId = userId;
    }

    public void addItem(Product product, int quantity) {

        if (items.containsKey(product.getId())) {
            CartItem item = items.get(product.getId());
            item.setQuantity(item.getQuantity() + quantity);
        } else {
            items.put(product.getId(), new CartItem(product, quantity));
        }
    }

    public void removeItem(String productId) {

        items.remove(productId);
    }

    public void updateItem(String productId, int quantity) {

        if (items.containsKey(productId)) {
            items.get(productId).setQuantity(quantity);
        }
    }

    public double getTotalCartPrice() {

        return items.values().stream()
                .mapToDouble(CartItem::getTotalPrice)
                .sum();
    }

    public Collection<CartItem> getAllItems(){

        return items.values();
    }
}
