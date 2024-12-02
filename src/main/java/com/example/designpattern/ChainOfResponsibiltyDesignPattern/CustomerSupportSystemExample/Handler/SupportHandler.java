package com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.Handler;

import com.example.designpattern.ChainOfResponsibiltyDesignPattern.CustomerSupportSystemExample.Model.Request;

public interface SupportHandler {
    
    void setNextHandler(SupportHandler handle);
    void handleRequest(Request request);
    
}
