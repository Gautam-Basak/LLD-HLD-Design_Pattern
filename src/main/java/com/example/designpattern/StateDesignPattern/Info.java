package com.example.designpattern.StateDesignPattern;

public class Info {

    // The State Design Pattern is a behavioral design pattern that allows an
    // object to change its behavior when its internal state changes.
    // This pattern is particularly useful when an object’s behavior depends
    // on its state, and the state can change during the object’s lifecycle.

    // Below are the steps to implement the State Design Pattern:

    // Understand the Purpose -
    // - The State Design Pattern is useful when an object’s behavior
    // changes based on its internal state.
    // -Instead of using lots of conditionals (like if or switch statements),
    // the State pattern allows you to represent different states as separate
    // classes, making the code cleaner and easier to manage.

    // Identify the Context -
    // -You need to identify the object whose behavior will change with
    // different states. For example, in a media player, states could be
    // “Playing”, “Paused”, or “Stopped”.
    // -The object (e.g., media player) is called the "Context", which will switch
    // between these different states.

    // Define State Interface -
    // -We will declare a state "Interface" with common actions that
    // all states need to implement. For instance, in a media player, actions
    // might include playing, pausing, or stopping the media.

    // Create Concrete State Classes -
    // -For each state, you create a class that defines what happens in that
    // particular state. For example, the “Playing” state would define the behavior
    // when the media player is playing.
    // -Each class handles its own specific behavior.

    // Design the Context Class -
    // -The Context class holds a reference to the current state. It will allow
    // the state to be switched dynamically during runtime.
    // -The context class will delegate actions to the current state—meaning,
    // it will rely on the state object to decide what behavior should be executed.

    // Flow :
    // Coin (Its an Enum which tell what denomination have to put in VM) ->
    // ItemType (Its an Enum which hold the type of items the machine sold) ->
    // Item (It holds the ItemType and Price(int) associated with it) ->
    // ItemShelf (It is a physical shelf in the VM where it consist of "code" (int,
    // given to each item), "Item" ands "soldOut" (boolean, will tell whether Item
    // got soldout or not) ->
    // Inventory (It contains array of ItemShelf which is being initialized with
    // initial capacity, then we will method to add items, get items an update sold
    // out status) ->
    // 
}
