package com.example.designpattern.ShoppingCartDesign;

import com.example.designpattern.ShoppingCartDesign.Strategy.DiscountStrategy;
import com.example.designpattern.ShoppingCartDesign.Strategy.FixedAmountDiscountConcreteStrategy;
import com.example.designpattern.ShoppingCartDesign.Strategy.NoDiscountConcreteStrategy;
import com.example.designpattern.ShoppingCartDesign.Strategy.PercentageDiscountConcreteStrategy;

public class MainClass {
    
    public static void main(String[] args) {
        
        Product p1 = new Product("1", "Laptop", "Dell XPS", 1200.0);
        Product p2 = new Product("2", "Mouse", "Logitech", 25.0);

        InventoryService inventoryService = new InventoryService();
        inventoryService.addStock("1", 10);
        inventoryService.addStock("2", 100);

        // Choose discount strategy here
        // DiscountStrategy discountStrategy = new PercentageDiscountConcreteStrategy(10);  // 10% off
         DiscountStrategy discountStrategy = new FixedAmountDiscountConcreteStrategy(100); // $100 off
        // DiscountStrategy discountStrategy = new NoDiscountConcreteStrategy(); // No discount

        CartService cartService = new CartService();

        Cart cart = cartService.geCart("user1");
        cart.addItem(p1, 1);
        cart.addItem(p2, 2);

        Order order = cartService.checkout("user1", inventoryService, discountStrategy);

        System.out.println("Order Total: " + order.getTotalPrice());
    }
}
