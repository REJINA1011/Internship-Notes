package com.f1soft.Task.DesignPatterns.Behavioral.Stragey.ArithmeticOperation;

public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int number1, int number2) {
        int result=0;
        if(number1>number2){
            result=number1-number2;
        } else if (number2>number1) {
            result=number2-number1;
        }
        return result;
    }
}
