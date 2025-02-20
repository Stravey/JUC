package com.strive.ThreadPool.first_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {

        /*// 第一种方法 无上限的
        //1.创建线程池
        ExecutorService pool1 = Executors.newCachedThreadPool();

        //2.向线程池提交任务
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);

        pool1.submit(new MyRunnable());
        Thread.sleep(1000);

        pool1.submit(new MyRunnable());
        Thread.sleep(1000);

        //3.销毁线程池
        //pool1.shutdown();*/

        //第二种方法
        ExecutorService pool2 = Executors.newFixedThreadPool(3);

        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());

    }
}
