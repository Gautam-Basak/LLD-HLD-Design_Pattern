package com.example.designpattern.DecoratorDesignPattern.Decorator;

import com.example.designpattern.DecoratorDesignPattern.Base.Pizza;

public abstract class ToppingsDecorator extends Pizza{
    
    public abstract String getDescription();

    public abstract int getCost();
}
