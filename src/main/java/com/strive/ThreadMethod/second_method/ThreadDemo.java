package com.strive.ThreadMethod.second_method;

public class ThreadDemo {
    public static void main(String[] args) {

        // setPriority(int newPriority)  设置线程的优先级
        // final int getPriority()   获取线程的优先级

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"熊大");
        Thread t2 = new Thread(mr,"熊二");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //main线程的优先级
        //System.out.println(Thread.currentThread().getPriority());

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
