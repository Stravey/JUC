package com.strive.ThreadPractice.sixth_practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        //接着practice5
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread_2 t1 = new MyThread_2(list);
        MyThread_2 t2 = new MyThread_2(list);

        t1.setName("Stack 1");
        t2.setName("Stack 2");

        t1.start();
        t2.start();

    }
}
