package com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteRestaurant;

import com.example.designpattern.FacadeDesignPattern.HotelExample.Menu;
import com.example.designpattern.FacadeDesignPattern.HotelExample.Restaurant;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.BothVegAndNonVegMenu;

public class BothVegAndNonVegRestaurant implements Restaurant{

    @Override
    public Menu getMenu() {
        
        return new BothVegAndNonVegMenu();
    }
    
}
