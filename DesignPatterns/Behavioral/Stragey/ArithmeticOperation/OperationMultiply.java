package com.f1soft.Task.DesignPatterns.Behavioral.Stragey.ArithmeticOperation;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int number1, int number2) {
        return number1 * number2;
    }
}
