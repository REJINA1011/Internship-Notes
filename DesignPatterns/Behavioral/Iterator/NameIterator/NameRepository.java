package com.f1soft.Task.DesignPatterns.Behavioral.Iterator.NameIterator;

public class NameRepository implements Container{
    public String [] names={"hello","world"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
