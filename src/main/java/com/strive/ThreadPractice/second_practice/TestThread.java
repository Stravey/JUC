package com.strive.ThreadPractice.second_practice;

public class TestThread {
    public static void main(String[] args) {

        //有100份礼品，两人同时发送，当剩下的礼品小于10份则不再送出
        //利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来

        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
