package com.f1soft.Task.DesignPatterns.Behavioral.Stragey.ArithmeticOperation;

public class Context {
    private Strategy strategy;

    Context(Strategy strategy){
        this.strategy=strategy;
    }
    public int executeStrategy(int number1, int number2){
        return strategy.doOperation(number1, number2);
    }
}
