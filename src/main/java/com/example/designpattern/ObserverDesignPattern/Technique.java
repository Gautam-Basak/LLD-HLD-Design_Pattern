package com.example.designpattern.ObserverDesignPattern;

public class Technique {
    
    // The Observer Design Pattern is a behavioral design pattern that defines
    // a one-to-many dependency between objects so that when one object (the subject)
    // changes state, all its dependents (observers) are notified and updated
    // automatically.

    // It primarily deals with the interaction and communication between objects,
    // specifically focusing on how objects behave in response to changes in the
    // state of other objects.

    // There will be four components -
    // 1) Subject - The subject maintains a list of observers (subscribers or listeners).
    //              It Provides methods to register and unregister observers dynamically
    //              and defines a method to notify observers of changes in its state.

    // 2) Observer - Observer is an interface with an update method that concrete
    //               observers must implement and ensures a common or consistent way for
    //               concrete observers to receive updates from the subject.
    //               Concrete observers implement this interface, allowing them to react
    //               to changes in the subject’s state.

    // 3) ConcreteSubject - ConcreteSubjects are specific implementations of the subject.
    //                      They hold the actual state or data that observers want to track.
    //                      When this state changes, concrete subjects notify their
    //                      observers.

    // 4) ConcreteObserver - Concrete Observer implements the observer interface.
    //                       They register with a concrete subject and react when notified
    //                       of a state change. When the subject’s state changes, the
    //                       concrete observer’s update() method is invoked, allowing it to
    //                       take appropriate actions. 
    //                       In a practical example, a weather app on your smartphone is
    //                       a concrete observer that reacts to changes from a weather
    //                       station.


    // Example -
    // 1) Consider a scenario where you have a weather monitoring system.
    //    Different parts of your application need to be updated when the weather
    //    conditions change.

    // 2) In any e-commerce application, when there is an out of stock we click on
    //    notify me. They notify me is implemented by Observer Design Patten
    //    Whoever click on the "Notify Me" will be consider as List of Observer and when
    //    the stock available its automatically notify all the users through mail or any
    //    other means whoever subscribe/click on notify me.
}
