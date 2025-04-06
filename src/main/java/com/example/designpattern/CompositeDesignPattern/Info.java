package com.example.designpattern.CompositeDesignPattern;

public class Info {

    // The Composite Design Pattern is a structural design pattern that lets you
    // compose objects into tree-like structures to represent part-whole
    // hierarchies.
    // It allows clients to treat individual objects and compositions of objects
    // uniformly. In other words, whether dealing with a single object or a group of
    // objects (composite), clients can use them interchangeably.

    // *** In Problem Statement we used something like List<Object> objectList and 
    // also use if-else condtion and instanceOf to determine either the object
    // is File or Directory and then we call "ls" method.
    // This cumbersome is overcome by the use of Composite Design Pattern.

    // How do I use Composite Design Pattern ?
    // 1. First we will have an Interface/Component (here FileSystem). There will be
    // two child for this.
    // 2. Second we will have "Leaf" (one of the Child) why we called this as Leaf
    // beacuse as you know in tree-like structure Leaf node is the last level beyond
    // that no node will be there (its like File inside a Folder).
    // 3. Third we will have "Composite" (one of the Other Child) and it contains
    // itself means (here its FileSystem). Why it contain itself because we don't know
    // the current node is the Leaf Node (if it is not then it must have another
    // node) or not and to have Node inside Node we must contain itself to support this. 
    

    // For example -
    // 1. File System - (Its a tree-like structure, Create folder A, inside A there
    // might be file or another folder B or both, again inside B there might be file
    // or folder C or both and so on). So what this pattern does it is use to access
    // the file (treat as an individual object) or goes inside another folder which
    // it will treat as an composition of object 


    // 2. Arithmethic Calculation - 2*(1+7)
    // How this can be represented in tree-like structure

    /*                  *
                       / \
                      /   \
                     2     +        This is like 2 * (1 + 7)
                          / \
                         /   \
                        1     7
    */ 
        
    //
}