package com.f1soft.Task.Thread.Methods;

class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("this is a thread1 class");
            try{
                System.out.println("Trying sleep() in thread 1");
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("error"+e);
            }
        }
    }

}
class Thread2 extends Thread{
    public void run(){
        System.out.println("this is a thread2 class");
    }
}
public class ThreadMethods{

    public static void main(String[] args){
        Thread1 threadClass = new Thread1();

        Thread2 threadClass1 = new Thread2();

        //Priority
        System.out.println("Setting Priority for Thread 1");
        threadClass.setPriority(10);
        System.out.println("Getting Priority of thread:"+threadClass.getName()+threadClass.getPriority());


        //thread1 is started
        threadClass.start();

        //thread1
        //getting and setting of thread name
        System.out.println("Setting Name of First Thread");
        threadClass.setName("First Thread");
        System.out.println("Getting Name of thread:"+threadClass.getName());


        //thread2 started
        threadClass1.start();

        //Priority; should be set before any other method implementation
        System.out.println("Setting Priority for Thread 2");
        System.out.println("Getting Priority of thread:"+threadClass1.getName()+threadClass1.getPriority());


        //getting and setting of thread name
        System.out.println("Setting Name of Second Thread");
        threadClass1.setName("Second Thread");
        System.out.println("Getting Name of thread:"+threadClass1.getName());



    }}
