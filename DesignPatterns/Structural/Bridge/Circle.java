package com.f1soft.Task.DesignPatterns.Structural.Bridge;

public class Circle extends Shape {
    private int pointX;
    private int pointY;
    private int radius;

    public Circle(int pointX, int pointY, int radius,DrawAPI drawAPI){
        super(drawAPI);
        this.pointX=pointX;
        this.pointY=pointY;
        this.radius=radius;
    }


    //calling method of DrawAPI interface
    @Override
    public void draw() {
        drawAPI.drawCircle(radius,pointX,pointY);
    }
}
