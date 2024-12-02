package com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingState.State;

import java.util.List;

import com.example.designpattern.StateDesignPattern.VendingMachineExample.Coin;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.Item;
import com.example.designpattern.StateDesignPattern.VendingMachineExample.VendingContext.VendingMachine;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine machinre, int codeNumber) throws Exception;

    public List<Coin> getFullRefund(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
