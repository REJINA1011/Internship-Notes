package com.f1soft.Task.DesignPatterns.Behavioral.Visitor;

public class Computer implements ComputerPart{

    ComputerPart []parts;

    Computer(){
        parts= new ComputerPart[]{new Mouse(),new Keyboard(), new Monitor()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart computerPart:parts){
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
