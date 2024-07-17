package com.f1soft.Task.DesignPatterns.Structural.Decorator.RedCircle;

//baseDecorator class/ wrapper class
public abstract class ShapeDecorator implements Shape{
    protected Shape decorateshape;

    ShapeDecorator(Shape decorateshape){

        this.decorateshape=decorateshape;
    }

    public void draw(){

        decorateshape.draw();
    }

}
