package com.strive.ThreadPractice.third_practice;

public class MyRunnable implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while(true){
            synchronized (MyRunnable.class){
                if(count > 100){
                    break;
                }else{
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count++;
                    if((count % 2) == 0){
                        System.out.println(Thread.currentThread().getName() + "打印的数字为" + count + "偶数");;
                    }else{
                        System.out.println(Thread.currentThread().getName() + "打印的数字为" + count + "奇数");
                    }
                }
            }
        }
    }
}
