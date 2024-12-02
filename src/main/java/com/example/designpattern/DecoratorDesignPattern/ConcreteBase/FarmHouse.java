package com.example.designpattern.DecoratorDesignPattern.ConcreteBase;

import com.example.designpattern.DecoratorDesignPattern.Base.Pizza;

public class FarmHouse extends Pizza {

    @Override
    public String getDescription() {

        return "FarmHouse";
    }

    @Override
    public int getCost() {

        return 200;
    }
}
