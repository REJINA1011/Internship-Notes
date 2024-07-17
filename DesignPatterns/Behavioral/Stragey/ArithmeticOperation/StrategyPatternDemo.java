package com.f1soft.Task.DesignPatterns.Behavioral.Stragey.ArithmeticOperation;

public class StrategyPatternDemo {
    public static void main(String[] args){

        Context context = new Context(new OperationAdd());
        System.out.println("addition of the numbers are "+context.executeStrategy(10,3));

        context=new Context(new OperationSubtract());
        System.out.println("Subtraction of the numbers are "+context.executeStrategy(10,3));

    }
}
