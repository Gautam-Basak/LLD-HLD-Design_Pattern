package com.example.designpattern.ChainOfResponsibiltyDesignPattern;

public class Info {
    
    // It is a behavioural design pattern
    
    // This pattern is frequently used in the chain of multiple objects,
    // where each object either handles the request or passes it on to
    // the next object in the chain if it is unable to handle that request.

    // Example : Customer Support System, ATM, Vending Machine, Logging System
    // Suppose in case ATM, if we try to 2000 Rs, first it will check for Rs 2000
    // denomination if available it will give and if not it will pass it to next
    // handler i.e Rs 1000 denomination and so on if not present upto Rs 100
    // and if Rs 100 are also not present it give default response.

    // Step 1: Define the Handler Interface: Create an interface with methods
    // for setting the next handler and processing requests.
    // Step 2: Create Concrete Handlers: Implement the handler interface in
    // multiple classes, each handling specific requests and passing unhandled
    // requests to the next handler.
    // Step 3: Set Up the Chain: Create instances of your handlers and link them
    // together by setting the next handler for each one.
    // Step 4: Send Requests: Use the first handler in the chain to send requests,
    // allowing each handler to decide whether to process it or pass it along.
}
