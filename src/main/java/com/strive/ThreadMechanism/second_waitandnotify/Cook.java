package com.strive.ThreadMechanism.second_waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("食物");
                System.out.println("厨师放了食物");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
