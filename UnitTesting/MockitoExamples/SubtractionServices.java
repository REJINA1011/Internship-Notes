package com.f1soft.Task.UnitTesting.MockitoExamples;

public class SubtractionServices {

    private Subtraction subtraction;

    public SubtractionServices(Subtraction subtraction){
        this.subtraction=subtraction;
    }

    public int performSubtraction(int a, int b){
        return subtraction.subtractOperation(a,b);
    }
}
