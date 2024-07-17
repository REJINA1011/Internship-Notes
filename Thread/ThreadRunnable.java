package com.f1soft.Task.Thread;

public class ThreadRunnable implements Runnable{
    public void run(){
        System.out.println("this is a runnable interface of thread");
    }

    public static void main(String[] args){
        ThreadRunnable threadRunnable = new ThreadRunnable();

        Thread thread = new Thread(threadRunnable);

        thread.start();

    }
}
