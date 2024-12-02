package com.example.designpattern.DecoratorDesignPattern.ConcreteToppings;

import com.example.designpattern.DecoratorDesignPattern.Base.Pizza;
import com.example.designpattern.DecoratorDesignPattern.Decorator.ToppingsDecorator;

public class FreshTomato extends ToppingsDecorator {

    Pizza pizza;

    public FreshTomato(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with fresh tomato";
    }

    @Override
    public int getCost() {
        
        return pizza.getCost() + 69;
    }
    
}
