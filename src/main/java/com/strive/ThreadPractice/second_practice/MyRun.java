package com.strive.ThreadPractice.second_practice;

public class MyRun implements Runnable {

    //礼物数量
    int gift = 0;

    @Override
    public void run() {
        while(true) {
            if (giftDistributed()) break;
        }
    }

    private synchronized boolean giftDistributed() {
        if(gift == 100) {
            return true;
        } else {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            gift++;
            System.out.println(Thread.currentThread().getName() + "正在送第" + gift + "份礼物，还剩" + (90 - gift) + "礼物");
        }
        return false;
    }
}
