package com.example.designpattern.FacadeDesignPattern.HotelExample;

import com.example.designpattern.FacadeDesignPattern.HotelExample.ConcreteMenu.VegMenu;

public class ClientMain {

    public static void main(String[] args) {

        RestaurantKeeper rk = new RestautantKeeperImpl();

        VegMenu vegMenu = rk.getVegMenu();
        vegMenu.showMenu();
    }
}
