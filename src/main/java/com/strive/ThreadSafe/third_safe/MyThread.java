package com.strive.ThreadSafe.third_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket = 0;

    //Lock锁
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //synchronized (MyThread.class){
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "卖第" + ticket + "张票！！！");
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                //
                lock.unlock();
            }
            //}
        }
    }
}
