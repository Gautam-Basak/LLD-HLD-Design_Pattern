package com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu;

import com.example.designpattern.FacadeDesignPattern.HotelExample.Menu;

public class NonVegMenu implements Menu{

    @Override
    public void showMenu() {
        
        System.out.println("Non Veg Menu");
    }
    
}
