package com.example.designpattern.CompositeDesignPattern.ArithmeticCalculationExample;

import com.example.designpattern.CompositeDesignPattern.ArithmeticCalculationExample.Component.ArithmeticExpression;
import com.example.designpattern.CompositeDesignPattern.ArithmeticCalculationExample.Composite.Expression;
import com.example.designpattern.CompositeDesignPattern.ArithmeticCalculationExample.Leaf.Number;

public class MainClass {
    public static void main(String[] args) {
        
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        Expression addExpression = new Expression(one, seven, Operation.ADD);

        Expression parentExpression = new Expression(two, addExpression, Operation.MULTIPLY);

        parentExpression.evaluate();

        
    }
}
