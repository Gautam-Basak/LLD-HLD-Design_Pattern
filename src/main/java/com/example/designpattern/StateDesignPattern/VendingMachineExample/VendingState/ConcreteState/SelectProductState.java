package com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingState.ConcreteState;

import java.util.List;

import com.example.designpattern.StateDesignPattern.VendingMachineExample.Coin;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.Item;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingContext.VendingMachine;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingState.State.State;

public class SelectProductState implements State {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {

        Item item = machine.getInventory().getItem(codeNumber);

        int paidByUser = 0;
        for (Coin coin : machine.getCoinList()) {
            paidByUser = paidByUser + coin.value;
        }

        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice()
                    + " and you paid: " + paidByUser);
            getFullRefund(machine);
            throw new Exception("insufficient amount");
        }
        else if(paidByUser >= item.getPrice()) {

            if(paidByUser > item.getPrice()) {
                getChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        // actual logic should be to return COINs in the dispense tray, but for
        // simplicity i am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;

    }

    @Override
    public Item dispenseProduct(VendingMachine machinre, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public List<Coin> getFullRefund(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();

    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }

}
