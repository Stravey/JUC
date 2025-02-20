package com.strive.ThreadPractice.sixth_practice;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread_1 extends Thread {

    //抽奖箱{10,5,20,50,100,200,500,800,2,80,300,700}
    //集合

    ArrayList<Integer> list;

    public MyThread_1(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程1使用的集合
    static ArrayList<Integer> list1 = new ArrayList<>();
    //线程2使用的集合
    static ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        while(true) {
            synchronized (MyThread_1.class) {
                if(list.isEmpty()) {
                    if("Stack 1".equals(Thread.currentThread().getName())) {
                        System.out.println("Stack 1" + list1);
                    }else {
                        System.out.println("Stack 2" + list2);
                    }
                    break;
                }else{
                    //打乱集合
                    Collections.shuffle(list);
                    Integer prize = list.removeFirst();
                    if("Stack 1".equals(getName())){
                        list1.add(prize);
                    }else {
                        list2.add(prize);
                    }
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
