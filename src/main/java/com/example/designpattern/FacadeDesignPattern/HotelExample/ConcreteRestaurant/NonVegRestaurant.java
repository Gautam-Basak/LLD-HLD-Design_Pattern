package com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteRestaurant;

import com.example.designpattern.FacadeDesignPattern.HotelExample.Menu;
import com.example.designpattern.FacadeDesignPattern.HotelExample.Restaurant;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.NonVegMenu;

public class NonVegRestaurant implements Restaurant{

    @Override
    public Menu getMenu() {
        
        return new NonVegMenu();
    }
    
}
