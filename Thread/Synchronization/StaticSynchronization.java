package com.f1soft.Task.Thread.Synchronization;
class StaticThread {
 // when using static synchronized, we can directly call the method using the Thread class without passing the object to the Thread class
 synchronized static void decrement(int value){
     value--;
     System.out.println("Decerment value "+value);
     try{
      Thread.sleep(2000);
     }catch (Exception e){
       e.printStackTrace();
     }
 }
}

class ThreadOne extends Thread{
 @Override
 public void run() {
  StaticThread.decrement(100);
 }
}

class ThreadTwo extends Thread{
 @Override
 public void run() {
  StaticThread.decrement(50);
 }

}

public class StaticSynchronization {
  public static void main(String[] args){
   ThreadOne t1= new ThreadOne();
   ThreadTwo t2= new ThreadTwo();

   t1.start();
   t2.start();
  }
}
