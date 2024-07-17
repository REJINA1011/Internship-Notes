package com.f1soft.Task.DesignPatterns.Structural.Decorator.MakeUp;

public class DryFoundation extends MakeUp {

    DryFoundation(Gender gender) {
        super(gender);
    }

    public void setFoundation(Gender gender){
        System.out.println("Use Dry Foundation");
    }

    @Override
    public void oilySkin() {
        gender.oilySkin();
        setFoundation(gender);
    }
}
