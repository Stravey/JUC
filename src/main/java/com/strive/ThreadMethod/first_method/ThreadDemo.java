package com.strive.ThreadMethod.first_method;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        /*
        * 多线程中常用的成员方法
        * 1. String getName()
        * 2. void setName(String name)
        *       注：线程默认有名字 Thread — X（从0开始，数字）
        *          给线程设置名字时可以通过setName方法和Thread的构造方法
        *
        * 3. static Thread currentThread()
        *       注：JVM虚拟机启动后，会自动启动多条线程
        *           有一条线程叫main线程
        *           自己写的所有线程都是运行在main线程中的
        *
        * 4. static void sleep(long time)
        *       注：线程睡眠时间 1s = 1000 ms
        * */

        //创建MyThread对象
        MyThread t1 = new MyThread("火箭");
        MyThread t2 = new MyThread("高铁");

        //启动线程
        t1.start();
        t2.start();

        //获取当前线程的对象
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);

        //让线程睡眠
        System.out.println("11111111111");
        Thread.sleep(3000);
        System.out.println("22222222222");

    }
}
