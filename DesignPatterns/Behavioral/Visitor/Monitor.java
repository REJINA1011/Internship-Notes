package com.f1soft.Task.DesignPatterns.Behavioral.Visitor;

public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
