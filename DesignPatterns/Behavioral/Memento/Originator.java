package com.f1soft.Task.DesignPatterns.Behavioral.Memento;

public class Originator {
    private String state;

    public void setState(String state){
        this.state=state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStatetoMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }

}
