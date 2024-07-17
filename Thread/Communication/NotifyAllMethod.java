package com.f1soft.Task.Thread.Communication;

class ThreadC extends Thread{
    @Override
    public void run() {
        synchronized (this){
            System.out.println("Starting of "+Thread.currentThread().getName());
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Notified thread "+Thread.currentThread().getName());
        }
    }
}
class ThreadD extends Thread{

    ThreadC threadC;
    ThreadD(ThreadC threadC){
        this.threadC= threadC;
    }
    @Override
    public void run() {
        synchronized (threadC){
            System.out.println("Starting of "+Thread.currentThread().getName());
            try{
                threadC.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Notified thread "+Thread.currentThread().getName());
        }
    }
}

class NotifyAllThread extends Thread
{
    ThreadC threadC;
    NotifyAllThread(ThreadC theadC){
        this.threadC=theadC;
    }
    @Override
    public void run() {
        synchronized (threadC){
            System.out.println("Starting of "+Thread.currentThread().getName());
            threadC.notifyAll();
            System.out.println("Notified thread "+Thread.currentThread().getName());
        }
    }
}

public class NotifyAllMethod {
    public static void main(String[] args) throws InterruptedException{

        ThreadC threadC = new ThreadC();
        ThreadD threadD = new ThreadD(threadC);
        NotifyAllThread notifyAllThread = new NotifyAllThread(threadC);

        Thread t1= new Thread(threadC,"Thread 1");
        Thread t2= new Thread(threadD,"Thread 2");
        Thread t3= new Thread(notifyAllThread,"Thread 3");

        t1.start();;
        t2.start();
        Thread.sleep(2000);
        t3.start();
    }
}
