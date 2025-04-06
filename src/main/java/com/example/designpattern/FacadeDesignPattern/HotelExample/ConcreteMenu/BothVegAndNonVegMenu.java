package com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu;

import com.example.designpattern.FacadeDesignPattern.HotelExample.Menu;

public class BothVegAndNonVegMenu implements Menu{

    @Override
    public void showMenu() {
        
        System.out.println("Both Veg and Non veg Menu");
    }
    
}
