package com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingState.ConcreteState;

import java.util.List;

import com.example.designpattern.StateDesignPattern.VendingMachineExample.Coin;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.Item;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingContext.VendingMachine;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingState.State.State;

public class HasMoneyState implements State{

    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    // In this state there is nothing to do so simply return it.
    // We cannot give any default implementation or throw exception.
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    // We are changing the state from one to another. Once we click on the
    // "clickOnInsertCoinButton" we want the Vending Machine ready for "Selection
    // Product State" where we will insert coins.
    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectProductState());
    }

    // We are adding the Coins in this state
    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }

    // In this state after inserting the coins if we don't want the product we
    // can get the refund ans setting the machine in "Idle state".
    @Override
    public List<Coin> getFullRefund(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");
    }

    
}
