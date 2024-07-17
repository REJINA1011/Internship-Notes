package com.f1soft.Task.UnitTesting.MockitoExamples;

public class AdditionServices {
    private Addition addition;

    public AdditionServices(Addition addition){
        this.addition=addition;
    }

    public int performAddition(int a, int b){
        System.out.println("testing");
        return addition.addOperation(a,b);
    }
}
