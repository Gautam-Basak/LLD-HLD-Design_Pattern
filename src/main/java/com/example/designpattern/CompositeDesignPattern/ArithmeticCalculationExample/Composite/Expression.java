package com.example.designpattern.CompositeDesignPattern.ArithmeticCalculationExample.Composite;

import com.example.designpattern.CompositeDesignPattern.ArithmeticCalculationExample.Operation;
import com.example.designpattern.CompositeDesignPattern.ArithmeticCalculationExample.Component.ArithmeticExpression;

public class Expression implements ArithmeticExpression {

    private ArithmeticExpression leftExpression;
    private ArithmeticExpression rightExpression;
    private Operation operation;

    public Expression(ArithmeticExpression lefPart, ArithmeticExpression rightPart, Operation op) {
        this.leftExpression = lefPart;
        this.rightExpression = rightPart;
        this.operation = op;
    }

    @Override
    public int evaluate() {

        int value = 0;
        switch (operation) {

            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }

        System.out.println("Expression value is :" + value);
        return value;

    }
}
