package com.strive.ThreadMechanism.second_waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {

        //使用阻塞队列解决 生产者消费者模型

        //1.创建阻塞队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //2.创建线程对象
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        //3.开启线程
        c.start();
        f.start();

    }
}
