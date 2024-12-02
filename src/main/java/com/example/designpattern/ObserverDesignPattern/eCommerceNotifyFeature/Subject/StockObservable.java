package com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.Subject;

import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.Observer.NotificationAlertObserver;

public interface StockObservable {

    void addSubscriber(NotificationAlertObserver observer);

    void removeSubscriber(NotificationAlertObserver observer);

    void notifySubscriber();

    void setStockCount(int newStockAdded);

    public int getStockCount(); 
    
}
