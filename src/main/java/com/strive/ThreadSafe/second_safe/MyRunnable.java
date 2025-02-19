package com.strive.ThreadSafe.second_safe;

public class MyRunnable implements Runnable {

    int ticket = 0;

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            if (method()) break;
        }
    }

    //非静态 锁对象 this
    private synchronized boolean method() {
        //3.判断共享数据是否到了末尾，到了末尾
        if (ticket == 100) {
            return true;
        } else {
            //4.判断共享数据是否到了末尾，没到末尾
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "卖第" + ticket + "张票");
        }
        return false;
    }
}
