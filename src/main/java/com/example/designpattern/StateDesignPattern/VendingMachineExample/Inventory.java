package com.example.designpattern.StateDesignPattern.VendingMachineExample;

public class Inventory {

    private ItemShelf[] inventory = null;

    // Constructor
    public Inventory(int itemCount) {

        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    private void initialEmptyInventory() {

        int startCode = 101;
        for (int i = 0; i < inventory.length; i++) {

            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(startCode);
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
            startCode++;
        }
    }

    public void addItem(Item item, int itemCode) throws Exception {

        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == itemCode) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.item = item;
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int itemCode) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == itemCode && itemShelf.isSoldOut() == false) {
                return itemShelf.item;
            } else {
                throw new Exception("Item sold out");
            }
        }
        throw new Exception("Invalid item code");
    }

    public void updateSoldOutItem(int itemCode){
        for(ItemShelf itemShelf : inventory){
            if(itemShelf.getCode() == itemCode){
                itemShelf.setSoldOut(true);
            }
        }
    }
}
