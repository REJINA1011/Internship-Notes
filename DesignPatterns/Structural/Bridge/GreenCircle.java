package com.f1soft.Task.DesignPatterns.Structural.Bridge;

public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int pointX, int pointY) {
        System.out.println("Green Circle:[radius:"+radius+",(x:"+pointY+",y:"+pointY+")");
    }
}
