package com.f1soft.Task.DesignPatterns.Structural.Facade.ShapeMaker;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}