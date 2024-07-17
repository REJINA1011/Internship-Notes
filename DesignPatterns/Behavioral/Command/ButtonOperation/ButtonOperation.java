package com.f1soft.Task.DesignPatterns.Behavioral.Command.ButtonOperation;

//has all the operations for the button
public class ButtonOperation {

    private int numberFirst=20;
    private int numberSecond=10;

    public void addOperation(){
        System.out.println("Addition of ["+numberFirst+","+numberSecond+"] is:"+(numberFirst+numberSecond));
    }

    public void subtractOperation(){
        int result=0;
        if(numberFirst>numberSecond){
            System.out.println("Subtraction of ["+numberFirst+","+numberSecond+"] is:"+(numberFirst-numberSecond));
        } else if (numberSecond>numberFirst) {
            System.out.println("Subtraction of ["+numberSecond+","+numberFirst+"] is:"+(numberSecond-numberFirst));
        }
    }
}
