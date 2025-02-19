package com.strive.ThreadSafe.third_safe;

import com.strive.ThreadSafe.second_safe.MyRunnable;

public class ThreadDemo {
    public static void main(String[] args) {

        //某电影院正在卖票，共有三个窗口，有100张票
        //Lock锁

        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();


        th1.setName("窗口1");
        th2.setName("窗口2");
        th3.setName("窗口3");

        th1.start();
        th2.start();
        th3.start();

    }
}
