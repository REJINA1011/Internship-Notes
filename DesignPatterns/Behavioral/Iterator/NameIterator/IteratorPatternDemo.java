package com.f1soft.Task.DesignPatterns.Behavioral.Iterator.NameIterator;

public class IteratorPatternDemo {
    public static void main(String[] args){

        NameRepository namesRepository = new NameRepository();

        for(Iterator iter= namesRepository.getIterator();iter.hasNext();){
            String name=(String)iter.next();
            System.out.println("Contents:"+name);
        }

    }
}
