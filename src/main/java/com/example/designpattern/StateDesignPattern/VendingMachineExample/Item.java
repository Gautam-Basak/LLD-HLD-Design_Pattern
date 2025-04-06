package com.example.designpattern.StateDesignPattern.VendingMachineExample;

public class Item {

    private ItemType type;
    private int price;

    public ItemType getType() {
        return type;
    }
    public void setType(ItemType itemType) {
        this.type = itemType;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }  
    
}
