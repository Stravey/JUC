package com.strive.ThreadPractice.first_practice;

public class MyThread extends Thread {

    static int ticket = 0;

    @Override
    public void run() {
        //
        while (true) {
            synchronized (MyThread.class) {
                if(ticket == 1000){
                    break;
                }else{
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName() +"正在卖第" + ticket + "张票，还剩" + (1000 - ticket) + "张票");
                }
            }
        }
    }
}
