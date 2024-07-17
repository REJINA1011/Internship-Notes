package com.f1soft.Task.Thread.Communication;

class ThreadA extends Thread{
    int total=10;
    @Override
    public void run() {

        synchronized (this){
            for(int i=0; i<5;i++)
                System.out.println(total++);
            //notify();
        }
    }
}

public class NotifyMethod{

    public static void main(String[] args){
        ThreadA threadA = new ThreadA();

        threadA.start();

        synchronized (threadA){

            //testing code
//            System.out.println("Inside Main Waiting for Thread to be completed");
//            //threadA.wait();
//            for(int i=0; i<5;i++)
//                System.out.println(i);


            //wait() method
            try{
                System.out.println("Inside Main Waiting for Thread to be completed");
                threadA.wait();
                for(int i=0; i<5;i++)
                    System.out.println(i);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}