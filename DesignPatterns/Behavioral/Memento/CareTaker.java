package com.f1soft.Task.DesignPatterns.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();

    public void addToMementoList(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }



}
