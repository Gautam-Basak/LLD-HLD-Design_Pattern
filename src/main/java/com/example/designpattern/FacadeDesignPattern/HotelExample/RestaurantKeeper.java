package com.example.designpattern.FacadeDesignPattern.HotelExample;

import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.BothVegAndNonVegMenu;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.NonVegMenu;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.VegMenu;

public interface RestaurantKeeper {
    
    public VegMenu getVegMenu();
    public NonVegMenu getNonVegMenu();
    public BothVegAndNonVegMenu getBothVegAndNonVegMenu();
}
