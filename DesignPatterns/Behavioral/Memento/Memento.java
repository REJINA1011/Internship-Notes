package com.f1soft.Task.DesignPatterns.Behavioral.Memento;

public class Memento {
    private String state;

    public Memento(String state){
        this.state=state;
    }

    public String getState(){
        return state;
    }
}
