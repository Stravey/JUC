package com.strive.ThreadPractice.fifth_practice;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

    //抽奖箱{10,5,20,50,100,200,500,800,2,80,300,700}
    //集合

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (MyThread.class) {
                if(list.isEmpty()) {
                    break;
                }else{
                    //打乱集合
                    Collections.shuffle(list);
                    Integer prize = list.removeFirst();
                    System.out.println(Thread.currentThread().getName() + "产生了一个" + prize + "元大奖");
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
