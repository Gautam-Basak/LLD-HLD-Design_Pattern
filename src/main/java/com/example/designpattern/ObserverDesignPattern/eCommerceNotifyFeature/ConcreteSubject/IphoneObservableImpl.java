package com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.ConcreteSubject;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.Observer.NotificationAlertObserver;
import com.example.designpattern.ObserverDesignPattern.eCommerceNotifyFeature.Subject.StockObservable;

public class IphoneObservableImpl implements StockObservable {

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addSubscriber(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeSubscriber(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {

        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {

        // Till Stock is available everthing is fine, once the stock count is 0, it will
        // notify all subscriber that stock is going to be back
        if (stockCount == 0) {
            notifySubscriber();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

}
