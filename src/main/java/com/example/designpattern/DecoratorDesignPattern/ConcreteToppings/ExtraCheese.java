package com.example.designpattern.DecoratorDesignPattern.ConcreteToppings;

import com.example.designpattern.DecoratorDesignPattern.Base.Pizza;
import com.example.designpattern.DecoratorDesignPattern.Decorator.ToppingsDecorator;

public class ExtraCheese extends ToppingsDecorator {

    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with extra cheese toppings ";
    }

    @Override
    public int getCost() {

        return pizza.getCost() + 99;
    }

}
