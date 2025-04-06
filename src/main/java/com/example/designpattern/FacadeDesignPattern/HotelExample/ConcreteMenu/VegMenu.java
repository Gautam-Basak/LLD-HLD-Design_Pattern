package com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu;

import com.example.designpattern.FacadeDesignPattern.HotelExample.Menu;

public class VegMenu implements Menu {

    @Override
    public void showMenu() {
        
        System.out.println("Veg Menu");
    }
    
}
