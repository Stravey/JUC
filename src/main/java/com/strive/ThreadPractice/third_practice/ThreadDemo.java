package com.strive.ThreadPractice.third_practice;

public class ThreadDemo {
    public static void main(String[] args) {

        //两个线程共同获取1~100之间的所有数字
        //输出所有的奇数

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"熊大");
        Thread t2 = new Thread(mr,"熊二");

        t1.start();
        t2.start();

    }
}
