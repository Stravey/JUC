package com.strive.ThreadMechanism.waitandnotify;

public class Foodie extends Thread {

    @Override
    public void run() {
        //1.循环
        //2.synchronized同步代码块
        //3.判断 到了末尾
        //4.判断 没有到末尾

        while (true) {
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    if(Desk.foodFlag == 0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        Desk.count--;
                        System.out.println("正在吃面条 " + Desk.count + " !!");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }

}
