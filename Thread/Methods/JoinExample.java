package com.f1soft.Task.Thread.Methods;

public class JoinExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 is finished");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 is finished"+Thread.currentThread());
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Main thread waits for thread1 to finish
            thread2.join(); // Main thread waits for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished");
    }
}
