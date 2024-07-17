package com.f1soft.Task.DesignPatterns.Behavioral.Visitor;

import java.security.Key;

public interface ComputerPart  {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
