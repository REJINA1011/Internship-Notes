package com.f1soft.Task.DesignPatterns.Structural.FLyweight;

import java.util.HashMap;

public class ShapeFactory{
    public static final HashMap<String, Circle> circleMap= new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle=(Circle) circleMap.get(color);
        if(circle== null){
            circle=new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color:"+color);
        }

        return circle;
    }
}
