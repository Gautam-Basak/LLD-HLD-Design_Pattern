package com.example.designpattern.AbstractFactoryDesignPattern;

public class Technique {

    // 1. Abstract Factory pattern is almost same as Factory Pattern and 
    // is considered as another layer of abstraction over factory pattern.

    // 2. Abstract Factory patterns work around a super-factory which creates
    // other factories.

    // 3. At runtime, the abstract factory is coupled with any desired concrete
    // factory which can create objects of the desired type.

    // In Factory PAttern what we do, we create a Factory Class which is responsible to
    // create objects of concreate implementation class of Product.
    // And what happen in Abstract Factory Pattern is, we will create multiple Factory
    // class where each Factory Class will be responsible for 'Group of Similar'
    // concrete implementation classes of Product A, similaely the other Factory
    // class will be responsible for Product B. Then we have 'Super Factory' class
    // which will be responsible to create object of Factory class 1, 2 and so on
    // which in turn will responsible to create object of different products.

    // Steps
    // 1. First we will create differernt products (Abstract Products).
    // 2. Second we will create concrete products (group of classes implements their 
    // respective Abstract Product)
    // 3. Then we will have Abstract Factory or Super Factory (Car Factory).
    // 4. Next we will have multiple concrete abstract factories where each one is
    // responsible for group of classes.
}