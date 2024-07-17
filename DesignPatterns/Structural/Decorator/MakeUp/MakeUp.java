package com.f1soft.Task.DesignPatterns.Structural.Decorator.MakeUp;

public abstract class MakeUp implements Gender {

    Gender gender;

    MakeUp(Gender gender){
        this.gender=gender;
    }

    @Override
    public void oilySkin() {
       gender.oilySkin();
    }
}
