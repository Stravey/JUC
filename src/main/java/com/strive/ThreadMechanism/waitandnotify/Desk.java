package com.strive.ThreadMechanism.waitandnotify;

public class Desk {

    //控制生产者和消费者的执行

    //桌子上是否有食物
    public static int foodFlag = 0;

    //总数
    public static int count = 10;

    //锁对象
    public static Object lock = new Object();

}
