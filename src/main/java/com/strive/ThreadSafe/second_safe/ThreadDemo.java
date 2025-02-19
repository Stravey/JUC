package com.strive.ThreadSafe.second_safe;

public class ThreadDemo {
    public static void main(String[] args) {

        //某电影院正在卖票，共有三个窗口，有100张票
        //同步方法
        //技巧：同步代码块

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
