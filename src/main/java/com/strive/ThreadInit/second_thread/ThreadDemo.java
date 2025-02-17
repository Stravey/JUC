package com.strive.ThreadInit.second_thread;

public class ThreadDemo {
    public static void main(String[] args) {

        /*
        *
        * 创建线程的第二种方法：
        * 通过Runnable接口实现
        * 1.自己定义一个类实现Runnable接口
        * 2.重写run方法
        * 3.创建自己的类的对象
        * 4.创建一个Thread类的对象，并开启线程
        *
        * */

        // 创建MyRun的对象
        // 执行任务的线程对象
        MyRun mr = new MyRun();

        // 创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        // 线程命名
        t1.setName("First Thread");
        t2.setName("Second Thread");

        // 启动线程
        t1.start();
        t2.start();

    }
}
