package com.example.designpattern.ChainOfResponsibiltyDesignPattern.LoggingSystemExample;

public class MainClass {
    public static void main(String[] args) {
        
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(null));
        logProcessor.log(2, "Information");
    }
}
