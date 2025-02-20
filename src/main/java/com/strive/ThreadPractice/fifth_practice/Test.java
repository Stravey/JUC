package com.strive.ThreadPractice.fifth_practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        //抽奖 奖池{10,5,20,50,100,200,500,800,2,80,300,700}
        //两个抽象箱

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);

        t1.setName("Stack 1");
        t2.setName("Stack 2");

        t1.start();
        t2.start();

    }
}
