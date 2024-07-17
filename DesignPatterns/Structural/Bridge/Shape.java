package com.f1soft.Task.DesignPatterns.Structural.Bridge;

abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }

    public abstract void draw();
}
