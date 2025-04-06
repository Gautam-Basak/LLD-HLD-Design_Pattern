package com.example.designpattern.ProxyDesignPattern;

public class Info {

    // It is a Structural Design Patern

    // The Proxy Design Pattern is a design pattern in which the client
    // and the actual object are connected by a proxy object. The client
    // communicates with the proxy, which manages access to the real object,
    // rather than the real object directly. Before sending the request to the
    // real object, the proxy can take care of additional tasks like caching,
    // security, logging, and lazy loading.

    // Components of Proxy Design Pattern :

    // Subject - The Subject is an interface or an abstract class that defines
    // the common interface shared by the RealSubject and Proxy classes.

    // RealSubject - The RealSubject is the actual object that the Proxy represents.
    // It contains the real implementation of the business logic or the
    // resource that the client code wants to access.

    // Proxy - The Proxy acts as a surrogate or placeholder for the RealSubject.
    // It controls access to the real object and may provide additional
    // functionality such as lazy loading, access control, or logging.

    // Example - Where it can be used.

    // 1. Security - Like when we access Internet some sites are blocked before
    // reaching to the actual Internet. Here what happened when we trying to access
    // Internet it goes into proxy object where it decide whether the site we want
    // access its in there policy or not, it not they will not allow/

    // 2. Caching - When we request something, before it actually hiting the DB, it
    // will check whether the requested data is present in Cache or not.

    // 3. Pre and Post processing - Suppose when we try to access some resource,
    // what
    // it will do before it actually fetching the resources it will log (
    // (i.e pre processing - who is accessing, what resource is accesing etc).
    // It will then fetch the resource but againg before reponding it will do post
    // processing like it will log what are resources it actually fectch etc etc
    // then give the acknowledgement. (Same happen with Event processing)

    // Spring boot internally implement Proxy Design Pattern in lots of places.
    // One of that is related to Transactional.
    // When we use @Transactional on top of any method, before it actually interact
    // with the DB, proxy interect and if anything goes wrong it actually does the
    // rollback, commit etc.
}
