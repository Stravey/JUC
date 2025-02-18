package com.strive.ThreadSafe.first_safe;

public class ThreadDemo {
    public static void main(String[] args) {

        //某电影院正在卖票，共有三个窗口，有100张票

        //创建窗口对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        //给窗口起名字
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        //启动卖票
        t1.start();
        t2.start();
        t3.start();

    }
}
