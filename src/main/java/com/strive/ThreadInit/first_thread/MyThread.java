package com.strive.ThreadInit.first_thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        // 打印输出100个Hello World
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World");
        }
    }

}
