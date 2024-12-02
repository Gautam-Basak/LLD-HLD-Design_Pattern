package com.example.designpattern.DecoratorDesignPattern;

import com.example.designpattern.DecoratorDesignPattern.Base.Pizza;
import com.example.designpattern.DecoratorDesignPattern.ConcreteBase.FarmHouse;
import com.example.designpattern.DecoratorDesignPattern.ConcreteBase.PeppyPaneer;
import com.example.designpattern.DecoratorDesignPattern.ConcreteToppings.ExtraCheese;
import com.example.designpattern.DecoratorDesignPattern.ConcreteToppings.FreshTomato;
import com.example.designpattern.DecoratorDesignPattern.Decorator.ToppingsDecorator;

public class MainClass {
    public static void main(String[] args) {

        // Peppy Paneer pizza with fresh tomato toppings
        Pizza peppyPizza = new PeppyPaneer();

        ToppingsDecorator toppings = new FreshTomato(peppyPizza);
        System.out.println(toppings.getDescription());
        System.out.println(toppings.getCost());


        // Farm House pizza with fresh tomato and extra cheese toppings
        Pizza farmPizza = new FarmHouse();

        ToppingsDecorator freshTomato = new FreshTomato(farmPizza);
        ToppingsDecorator extraCheese = new ExtraCheese(freshTomato);

        System.out.println("Description - " + extraCheese.getDescription());
        System.out.println("Total Cost - " + extraCheese.getCost());
    }
}
