package com.strive.ThreadInit.first_thread;

public class ThreadDemo {
    public static void main(String[] args) {

        /*
        * 创建编程的第一种方式：
        *
        * 1 自己写一个类继承Thread类
        * 2 重新Thread类的run方法
        * 3 创建MyThread对象
        *
        *
        *
        * */

        // 创建MyThread线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // 给线程命名
        t1.setName("First Thread");
        t2.setName("Second Thread");

        // 启动线程
        t1.start();
        t2.start();

    }
}
