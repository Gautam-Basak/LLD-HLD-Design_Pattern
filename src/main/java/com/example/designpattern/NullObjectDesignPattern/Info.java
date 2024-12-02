package com.example.designpattern.NullObjectDesignPattern;

public class Info {

    // It is a Behavioral Design Pattern
    // It basically replacement of Null Checks.

    // Whenever we pass some object as an argument or want to use any object which
    // is
    // beign fetched we generally put Null checks to erify whether the fetched
    // object
    // is Null or not, if not we use that else throw an exception.

    // What to be done ?
    // -A "NullObject" replaces NULL return type
    // -No need to put "IF" checks for checking null
    // -"NullObject" reflects do nothing or default behavior

    // How to Design ?

    // We will first create one Client.

    // Then we will create one Abstract Class/Interface (here Example : Vehicle)

    // Then there will be two implementatin of Abstract Class one is "Real Object"
    // (here Example : Car, Bike etc) and another one is "NullObject"

    // Next we will have FactoryVehicle where based on the input we will return
    // either Object of "Car", "Bike", "NullVehicle" etc.

}
