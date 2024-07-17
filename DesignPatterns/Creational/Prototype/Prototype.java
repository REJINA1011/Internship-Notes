package com.f1soft.Task.DesignPatterns.Creational.Prototype;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class Rectangle extends Shape{
    public Rectangle(){
        //inherited from Shape
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

//Class that clones the objects
class ShapeCache {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    //calls the method of Shape interface that clones the object provided
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.cloneObject();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes


    //load the actual objects in the hashMap
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}

public class Prototype {
   public static void main(String[] args){
       ShapeCache.loadCache();

       Shape clonedShape=(Shape) ShapeCache.getShape("1");
       System.out.println("Shape:"+clonedShape.getType());
   }
}
