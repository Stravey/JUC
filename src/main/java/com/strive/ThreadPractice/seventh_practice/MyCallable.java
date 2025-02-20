package com.strive.ThreadPractice.seventh_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    //抽奖箱{10,5,20,50,100,200,500,800,2,80,300,700}
    //集合

    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        // 每个线程可以有自己的思路
        ArrayList<Integer> boxList = new ArrayList<>();
        while(true) {
            synchronized (MyCallable.class) {
                if(list.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                }else{
                    //打乱集合
                    Collections.shuffle(list);
                    Integer prize = list.removeFirst();
                    boxList.add(prize);
                }
            }
            Thread.sleep(100);
        }
        //返回集合最大值
        if(boxList.isEmpty()) {
            return null;
        }else {
            return Collections.max(boxList);
        }
    }
}
