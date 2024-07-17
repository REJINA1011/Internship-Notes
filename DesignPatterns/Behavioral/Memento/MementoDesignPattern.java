package com.f1soft.Task.DesignPatterns.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class MementoDesignPattern {
    public static void main(String[] args){



        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        careTaker.addToMementoList(originator.saveStatetoMemento());

        originator.setState("State 2");
        careTaker.addToMementoList(originator.saveStatetoMemento());

        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());



    }
}
