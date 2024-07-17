package com.f1soft.Task.DesignPatterns.Structural.FLyweight;

public class Circle implements Shape{
    private int pointX;
    private int pointY;
    private int radius;
    private String color;

    public Circle(String color ){
        this.color=color;
    }

    public void setPointX(int pointX){
        this.pointX=pointX;
    }
    public void setPointY(int pointY){
        this.pointY=pointY;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle with[Radius:"+radius+"("+pointX+","+pointY+")]");
    }
}
