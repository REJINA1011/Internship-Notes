package com.f1soft.Task.DesignPatterns.Structural.Decorator.RedCircle;

//concrete class
public class RedShapeDecorator extends ShapeDecorator{
    RedShapeDecorator(Shape decorateshape) {

        super(decorateshape);
    }

    @Override
    public void draw() {
        decorateshape.draw();
        setRedBorder(decorateshape);
    }

    private void setRedBorder(Shape decorateshape){
        System.out.println("Border:Red");
    }
}
