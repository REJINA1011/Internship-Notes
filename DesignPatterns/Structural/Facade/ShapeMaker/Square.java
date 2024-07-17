package com.f1soft.Task.DesignPatterns.Structural.Facade.ShapeMaker;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
