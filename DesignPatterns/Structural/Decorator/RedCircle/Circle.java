package com.f1soft.Task.DesignPatterns.Structural.Decorator.RedCircle;

//wrapper class
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
