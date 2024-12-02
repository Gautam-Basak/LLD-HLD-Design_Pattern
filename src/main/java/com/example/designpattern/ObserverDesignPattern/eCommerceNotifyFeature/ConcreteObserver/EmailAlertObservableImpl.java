package com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.ConcreteObserver;

import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.Observer.NotificationAlertObserver;
import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.Subject.StockObservable;

public class EmailAlertObservableImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObservableImpl(StockObservable observable, String emailId){
        this.stockObservable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product back in stock, hurry up");
    }

    private void sendMail(String emailId2, String msg) {
        System.out.println("eMail sent to : " + emailId);
    }
    
}
