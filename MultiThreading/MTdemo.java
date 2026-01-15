package com.multithreading;

/*
 * Example 1: Creating a thread by implementing Runnable interface
 */
class MyRunnableThread implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000); // Pause execution for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("i -------------> " + i);
        }

        System.out.println("Current Thread: " + Thread.currentThread());
    }
}

/*
 * Example 2: Creating a thread by extending Thread class
 */
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Run method executed by: " + Thread.currentThread().getName());
    }
}

public class MTdemo {

    public static void main(String[] args) {

        // 1️. Using Runnable interface
        MyRunnableThread runnable = new MyRunnableThread();
        Thread t1 = new Thread(runnable);

        t1.setName("Worker-Thread");
        t1.setPriority(Thread.NORM_PRIORITY);

        t1.start(); // starts a new thread

        // 2️. Using Thread class
        MyThread t2 = new MyThread();
        t2.setName("Extended-Thread");
        t2.start();
    }
}
