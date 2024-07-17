package com.f1soft.Task.Thread.Synchronization;

class ThreadMessage{

    synchronized void printIncrement(int t){
        for(int i=0;i<5;i++){
            System.out.println(t++);
        }

    }
}
class ThreadSync1 extends Thread{
    ThreadMessage threadMessage1;

    ThreadSync1(ThreadMessage threadMessage1){
        this.threadMessage1=threadMessage1;
    }
    public void run(){
        threadMessage1.printIncrement(1);
    }

}
class ThreadSync2 extends Thread{
    ThreadMessage threadMessage2;

    ThreadSync2(ThreadMessage threadMessage2){
        this.threadMessage2=threadMessage2;
    }
    public void run() {
        threadMessage2.printIncrement(10);
    }
}
public class ThreadMethodSynchronization{

    public static void main(String[] args){
        ThreadMessage threadMessage = new ThreadMessage();
        ThreadSync1 threadClass = new ThreadSync1(threadMessage);

        ThreadSync2 threadClass1 = new ThreadSync2(threadMessage);

        //thread is started
        threadClass.start();
        threadClass1.start();

    }}
