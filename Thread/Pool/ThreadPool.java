package com.f1soft.Task.Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    String name;
    Task(String name){
        this.name=name;
    }

    @Override
    public void run() {
        try{
        for(int i= 0; i<5;i++){
            System.out.println(name + i);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class ThreadPool {

    public static void main(String[] args){
        Runnable r1 = new Task("first task");
        Runnable r2 = new Task("second task");
        Runnable r3 = new Task("third task");

        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);

        pool.shutdown();
    }
}
