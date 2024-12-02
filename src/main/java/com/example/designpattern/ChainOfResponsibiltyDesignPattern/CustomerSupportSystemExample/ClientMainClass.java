package com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample;

import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.ConcreteHandler.SupportHandler1;
import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.ConcreteHandler.SupportHandler2;
import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.ConcreteHandler.SupportHandler3;
import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.Handler.SupportHandler;
import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.Model.Priority;
import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.Model.Request;

public class ClientMainClass {
    public static void main(String[] args) {
        
        SupportHandler level1Handler = new SupportHandler1();
        SupportHandler level2Handler = new SupportHandler2();
        SupportHandler level3Handler = new SupportHandler3();

        // Here we are chaining one handler to another, if the current handler can
        // handle then its well and good else it will pass to the next handler.
        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request1 = new Request(Priority.MEDIUM);
        Request request2 = new Request(Priority.LOW);

        level1Handler.handleRequest(request1);
        level1Handler.handleRequest(request2);

    }
}
