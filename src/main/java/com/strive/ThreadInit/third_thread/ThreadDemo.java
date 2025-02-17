package com.strive.ThreadInit.third_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        * 多线程的第三种实现方式:
        * 1.创建一个类MyCallable实现Callable接口
        * 2.重写call方法
        *
        * 3.创建myCallable对象（线程执行的任务）
        * 4.创建FutureTask对象（多线程运行的结果）
        * 5.创建Thread类的对象 并启动
        *
        * */

        // 创建MyCallable对象
        MyCallable mc = new MyCallable();
        // 创建FutureTask对象
        FutureTask<Integer> ft = new FutureTask<>(mc);
        // 创建线程对象 并启动线程
        new Thread(ft).start();
        // 获取线程运行结果
        Integer result = ft.get();
        System.out.println(result);

    }
}
