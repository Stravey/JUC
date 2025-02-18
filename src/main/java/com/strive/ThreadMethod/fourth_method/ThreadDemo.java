package com.strive.ThreadMethod.fourth_method;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        // public static void yield() 出让/礼让线程
        // public final void join() 插入/插队线程


     /* MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("香菱");
        t2.setName("钟离");

        t1.start();
        t2.start();*/

        MyThread t3 = new MyThread();
        t3.setName("草莓");
        t3.start();

        //等草莓线程执行结束后，执行main线程
        t3.join();

        //执行main线程
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }

    }
}
