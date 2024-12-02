package com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.ConcreteHandler;

import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.Handler.SupportHandler;
import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.Model.Priority;
import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.Model.Request;

public class SupportHandler2 implements SupportHandler{

    private SupportHandler nexSupportHandler;
    
    @Override
    public void setNextHandler(SupportHandler handle) {
        this.nexSupportHandler = handle;
    }

    @Override
    public void handleRequest(Request request) {
        
        if(request.getPriority() == Priority.MEDIUM){
            System.out.println("Support level 2 handled the problem");
        }else if(nexSupportHandler != null){
            nexSupportHandler.handleRequest(request);
        }
    }
    
}
