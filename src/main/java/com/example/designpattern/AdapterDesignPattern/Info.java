package com.example.designpattern.AdapterDesignPattern;

public class Info {

    // It is a Structural Design Pattern. The adapter act as an bridge between our
    // application and third party application to use their interface.


    // Here we will take an example of Weight Machine.
    // Our application or our user want the output of weigh machine to be in "Kg"
    // but the third party application gives the output in "Pounds" so what we will
    // do here is that we will use Adapter to convert Pounds to Kg for the ease of
    // our user.

    // Components and How to Design.

    // Target Interface - Defines an interface expected by client or our user.

    // Adaptee/Existing Interface/Third Party Application - The existing class
    // or system with an incompatible interface that needs to be integrated into
    // the new system. It’s the class or system that the client code cannot directly
    // use due to interface mismatches.

    /*** It uses both Inheritance and Composition at the same time ***/
    // Adapter - This is the Bridge between between Target Interface and Adaptee.
    // This implements the Target Interface and internally uses an instance of the
    // adaptee to make it compatible with the target interface.

    // Client: The code that uses the target interface to interact with objects.
    // It remains unaware of the specific implementation details of the adaptee
    // and the adapter.
}
