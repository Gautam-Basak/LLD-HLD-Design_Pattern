package com.example.designpattern.ProxyDesignPattern.ImageExample;

public class Client {
    public static void main(String[] args) {
        
        Image image = new ProxyImage("image.jpg");

        // It will fetch from disk and cache
        image.display();
        // It will fetch from cache
        image.display();
        // It will fetch from ache
        image.display();


    }
}
