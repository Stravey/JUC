package com.strive.ThreadSafe.first_safe;

public class MyThread extends Thread {

    //static 表示这个类的对象都共享 ticket
    static int ticket = 0; // 票数

    //锁对象一定是唯一的
    //static final Object obj = new Object();

    @Override
    public void run() {
        //同步代码块
        for (int i = 0; i < 100; i++) {
            synchronized (MyThread.class){
                if(ticket < 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    ticket++;
                    System.out.println(getName() + "正在卖第" + i + "票");
                }else{
                    break;
                }
            }
        }
    }
}
