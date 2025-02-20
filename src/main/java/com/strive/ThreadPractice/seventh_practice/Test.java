package com.strive.ThreadPractice.seventh_practice;

import com.strive.ThreadPractice.sixth_practice.MyThread_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //接着practice5和practice6
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        //创建对线程运行的参数对象
        MyCallable mc = new MyCallable(list);

        FutureTask<Integer> ft1 = new FutureTask<>(mc);
        FutureTask<Integer> ft2 = new FutureTask<>(mc);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("Stack 1");
        t2.setName("Stack 2");

        t1.start();
        t2.start();

        Integer result1 = ft1.get();
        Integer result2 = ft2.get();

        System.out.println(result1);
        System.out.println(result2);

    }
}
