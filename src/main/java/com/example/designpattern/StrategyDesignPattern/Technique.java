package com.example.designpattern.StrategyDesignPattern;

public class Technique {

    // Suppose we have some behaviours in our parent class, which is implement by
    // multiple child class.
    // Untill all the child classes uses the parent behaviour/overridden behaviour
    // its fine.
    // The moment all/most/some of the overridden behaviour(implementation) are
    // similar, we will get those out and make a group for that
    // (we call that as a concrete strategy).

    // What we will do?
    // 1. We will have a "Strategy Interface" which will be implemented by the
    // different groups having similar behaviour i.e "Concrete Strategy".
    // 2. Once we have the Concrete Strategies, now as an when required differnt
    // class will extends these Strategies and at run time based on the
    // requirement will be create the objects and pass it.
    // 3. We will have Strategy class(here Vehicle) where we will use the Strategy
    // Interface as a composition and instantiate using constructor.
}
   
