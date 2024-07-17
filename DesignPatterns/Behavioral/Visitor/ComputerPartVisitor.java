package com.f1soft.Task.DesignPatterns.Behavioral.Visitor;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
    public void visit(Mouse mouse);
}
