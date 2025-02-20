package com.strive.ThreadPractice.first_practice;

public class TestThread {
    public static void main(String[] args) {

        //一共有1000张电影票，可以在两个窗口领取，每次领取时间为2000ms
        //使用多线程模拟买票过程并打印剩余电影票数量

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();

    }
}
