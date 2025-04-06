package com.example.designpattern.FacadeDesignPattern.HotelExample;

public class Info {

    // Its a Structural Design Pattern.
    // The house is the facade, it is visible to the outside world, but beneath it
    // is a working system of pipes, cables, and other components that allow the
    // building to run. It provides an easy-to-use interface so that users may
    // interact with the system.

    // In simple language what I understood is that, consider a system which consist
    // of multiple complex sub-system/process which have their own implementation.
    // What Facade do is, it provides a simple inteface in the above example its a
    // House with which Client interact and get the work done without having the
    // knowledge of the entire system.

    // Example 1 - We will take an example of Hotel Menu selection process.
    // As a person I don't know how menu is maintained or how it is implemented
    // internally.
    // My only thing is that how we select the menu and order the food.
    // Flow:
    // Menu -> Concrete Menu -> Restaurant -> Concrete Restaurant -> Restaurant
    // Keeper ->
    // Restaurant Keeper Implementation -> Client
    // *** You can see all the concrete restaurant can work individually.
    // But here we bring all the restaurant together and create Restaurant Keeper
    // which is nothing but "Facade".

    // We will see how it is different from Proxy and Adapter design pattern.

    //
}
