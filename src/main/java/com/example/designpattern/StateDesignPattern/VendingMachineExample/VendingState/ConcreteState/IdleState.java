package com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingState.ConcreteState;

import java.util.List;

import com.example.designpattern.StateDesignPattern.VendingMachineExample.Coin;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.Item;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingContext.VendingMachine;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingState.State.State;

// We we only implement those behavior which are related to idel state. Rest we will
// give default implementation or will throw error.
// So in Idel State - "clickOnInsertCoinButton" works.
public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently Vending machine is in IdleState");
    }

    // Here we setting pre defined Coin List
    public IdleState(VendingMachine machine) {
        System.out.println("Currently Vending machine is in IdleState");
        
    }

    // We are changing the state from one to another. Once we click on the
    // "clickOnInsertCoinButton" we want the Vending Machine ready for "Has Money
    // State" where we will insert coins.
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in idle state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machinre, int codeNumber) throws Exception {
        throw new Exception("proeduct can not be dispensed idle state");
    }

    @Override
    public List<Coin> getFullRefund(VendingMachine machine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }

    // Update the Inventory in Idle State
    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }

}
