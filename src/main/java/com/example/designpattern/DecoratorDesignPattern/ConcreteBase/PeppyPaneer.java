package com.example.designpattern.DecoratorDesignPattern.ConcreteBase;

import com.example.designpattern.DecoratorDesignPattern.Base.Pizza;

public class PeppyPaneer extends Pizza {


    @Override
    public String getDescription() {

        return "PeppyPaneer";
    }

    @Override
    public int getCost() {

        return 150;
    }
}
