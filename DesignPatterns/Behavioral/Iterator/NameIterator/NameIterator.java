package com.f1soft.Task.DesignPatterns.Behavioral.Iterator.NameIterator;

public class NameIterator implements Iterator{
    int index;

    public String [] names={};
    NameIterator(String[]names){
        this.names=names;
    }
    @Override
    public boolean hasNext() {
        if(index<names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }

}
