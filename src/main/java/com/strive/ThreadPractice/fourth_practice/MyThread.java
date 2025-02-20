package com.strive.ThreadPractice.fourth_practice;

import java.util.Random;

public class MyThread extends Thread {

    //共享数据
    //红包数据
    static double money = 100;
    static int count = 3;

    //最小的中奖金额
    static final double MIN = 0.01;


    @Override
    public void run() {
        synchronized (MyThread.class){
            if(count == 0){
                System.out.println(Thread.currentThread().getName() + "没有抢到红包");
            }else{
                double prize = 0;
                if(count == 1){
                    prize = money;
                }else{
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    prize = r.nextDouble(bounds);
                    if(prize < MIN){
                        prize = MIN;
                    }
                }
                money -= prize;
                count--;
                System.out.println(Thread.currentThread().getName() + "抢到了" + prize + "元");
            }
        }
    }
}
