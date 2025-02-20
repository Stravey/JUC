package com.strive.ThreadPractice.sixth_practice;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread_2 extends Thread {
    //抽奖箱{10,5,20,50,100,200,500,800,2,80,300,700}
    //集合

    ArrayList<Integer> list;

    public MyThread_2(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 每个线程可以有自己的思路
        ArrayList<Integer> boxList = new ArrayList<>();
        while(true) {
            synchronized (MyThread_2.class) {
                if(list.isEmpty()) {
                    System.out.println("Stack 1" + boxList);
                    break;
                }else{
                    //打乱集合
                    Collections.shuffle(list);
                    Integer prize = list.removeFirst();
                    boxList.add(prize);
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
