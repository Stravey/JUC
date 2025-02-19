package com.strive.ThreadMechanism.first_waitandnotify;

public class Cook extends Thread {
    @Override
    public void run() {
        //1.循环
        //2.synchronized同步代码块
        //3.判断 到了末尾
        //4.判断 没有到末尾

        while(true){
            synchronized(Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    if(Desk.foodFlag == 1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("制作食物");
                        Desk.foodFlag = 1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
