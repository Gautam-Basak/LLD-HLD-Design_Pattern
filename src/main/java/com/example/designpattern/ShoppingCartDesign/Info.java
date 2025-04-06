package com.example.designpattern.ShoppingCartDesign;

public class Info {

    // Design Shopping Cart
    // User.class ->
    // Product.class -> Have details related to product
    // CartItem.class -> It holds Product and Quantity and total price.
    // Cart -> It holds a map of productId and CartItem, then we will allow to add
    // Product, remove Product, update Product. It also contains UserId.
    // InventoryService -> It will be used to add stock, check stock availability and
    // reduce stock.
    // Order.class -> It hold orderId, userId, List of CartItem, totalPrice.
    // We can use Strategy Design Pattern to implement Dynamic Discount. 
}
