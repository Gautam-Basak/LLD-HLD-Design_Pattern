package com.example.designpattern.StrategyDesignPattern;

public class Technique {

    // Strategy Design Pattern
    // The Strategy Design Pattern is a behavioral design pattern that enables
    // selecting an algorithm's behavior at runtime. It defines a family of
    // algorithms, encapsulates each one, and makes them interchangeable.

    // Key Concepts:
    // Strategy Interface: Defines a common interface for all supported algorithms

    // Concrete Strategies: Implement the algorithm using the Strategy interface

    // Context: Maintains a reference to a Strategy object and uses it to execute
    // the algorithm

    // Why Use Strategy Pattern?
    // Eliminates conditional statements: Replaces complex conditionals with
    // polymorphic behavior

    // Open/Closed Principle: New strategies can be added without modifying existing
    // code

    // Runtime flexibility: Algorithms can be swapped at runtime

    // Separation of concerns: Algorithm implementation is separated from the
    // context that uses it


    // ---------

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
