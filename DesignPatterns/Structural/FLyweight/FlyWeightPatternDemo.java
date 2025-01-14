package com.f1soft.Task.DesignPatterns.Structural.FLyweight;

public class FlyWeightPatternDemo {
    private static final String colors[]={"Red","Green"};
    public static void main(String[] args){

        for(int i=0; i < 5; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setPointX(getRandomX());
            circle.setPointY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
