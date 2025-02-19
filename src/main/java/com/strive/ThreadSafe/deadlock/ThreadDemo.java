package com.strive.ThreadSafe.deadlock;

class mythread extends Thread {

    static final Object objA = new Object();
    static final Object objB = new Object();

    @Override
    public void run() {
        while (true) {
            if ("线程A".equals(Thread.currentThread().getName())) {
                synchronized (objA) {
                    System.out.println("线程A拿到了A锁，准备拿B锁");
                    synchronized (objB) {
                        System.out.println("线程A拿到了B锁");
                    }
                }
            } else if ("线程B".equals(Thread.currentThread().getName())) {
                synchronized (objB) {
                    System.out.println("线程B拿到了B锁，准备拿A锁");
                    synchronized (objA) {
                        System.out.println("线程B拿到了A锁");
                    }
                }
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        t1.start();
    }
}

