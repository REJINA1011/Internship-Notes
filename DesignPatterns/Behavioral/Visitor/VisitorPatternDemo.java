package com.f1soft.Task.DesignPatterns.Behavioral.Visitor;

public class VisitorPatternDemo {
    public static void main(String[] args){

//        ComputerPart computer = new Computer();
//
//        computer.accept(new ComputerPartDisplayVisitor());

            ComputerPart mouse = new Mouse();
            mouse.accept(new ComputerPartDisplayVisitor());

    }
}
