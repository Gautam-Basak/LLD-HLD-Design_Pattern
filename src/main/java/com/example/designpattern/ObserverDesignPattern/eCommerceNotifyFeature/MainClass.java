package com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature;

import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.ConcreteObserver.EmailAlertObservableImpl;
import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.ConcreteSubject.IphoneObservableImpl;
import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.Observer.NotificationAlertObserver;
import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.Subject.StockObservable;

public class MainClass {
    public static void main(String[] args) {

        StockObservable stockObservable = new IphoneObservableImpl();

        NotificationAlertObserver nao1 = new EmailAlertObservableImpl(stockObservable, "basakgautam16@gmail.com");
        NotificationAlertObserver nao2 = new EmailAlertObservableImpl(stockObservable, "basakraja16@gmail.com");

        stockObservable.addSubscriber(nao1);
        stockObservable.addSubscriber(nao2);

        stockObservable.setStockCount(10);
    }
}
