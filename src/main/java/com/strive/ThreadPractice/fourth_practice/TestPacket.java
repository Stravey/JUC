package com.strive.ThreadPractice.fourth_practice;

public class TestPacket {
    public static void main(String[] args) {

        //100块的红包，分成3个包，5个人去抢，两个人没抢到

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.setName("HH");
        t2.setName("QQ");
        t3.setName("WX");
        t4.setName("XHS");
        t5.setName("X");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
