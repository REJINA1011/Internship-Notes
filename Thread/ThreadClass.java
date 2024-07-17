package com.f1soft.Task.Thread;

public class ThreadClass extends Thread{
    public void run(){
        System.out.println("this is a extended thread class");
    }

    public static void main(String[] args){
        ThreadClass threadClass = new ThreadClass();

        threadClass.start();

    }
}
