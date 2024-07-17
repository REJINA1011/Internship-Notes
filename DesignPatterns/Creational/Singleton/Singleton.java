package com.f1soft.Task.DesignPatterns.Creational.Singleton;

class SingletonObject {

    //class level access to the instance
    private static SingletonObject instance;

    //for ensuring single object creation
    private SingletonObject(){
    }

    //static method for instance creation through private constructor
    public static SingletonObject getInstance(){
        if(instance==null) {
            instance=new SingletonObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("SingleTon");
    }
}

public class Singleton {
    public static void main(String[] args) {

        SingletonObject object = SingletonObject.getInstance();
        object.showMessage();
    }
}


