package com.example.designpattern.FacadeDesignPattern.HotelExample;

import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.BothVegAndNonVegMenu;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.NonVegMenu;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.VegMenu;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteRestaurant.BothVegAndNonVegRestaurant;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteRestaurant.NonVegRestaurant;
import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteRestaurant.VegRestaurant;

public class RestautantKeeperImpl implements RestaurantKeeper{

    @Override
    public VegMenu getVegMenu() {
        
        VegRestaurant vr = new VegRestaurant();
        VegMenu vm = (VegMenu)vr.getMenu();
        return vm;
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        
        NonVegRestaurant vr = new NonVegRestaurant();
        NonVegMenu nvm = (NonVegMenu)vr.getMenu();
        return nvm;
    }

    @Override
    public BothVegAndNonVegMenu getBothVegAndNonVegMenu() {
        
        BothVegAndNonVegRestaurant bvnvr = new BothVegAndNonVegRestaurant();
        BothVegAndNonVegMenu bvnvm = (BothVegAndNonVegMenu)bvnvr.getMenu();
        return bvnvm;
    }
    
}
