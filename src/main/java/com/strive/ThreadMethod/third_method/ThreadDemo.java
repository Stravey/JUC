package com.strive.ThreadMethod.third_method;

public class ThreadDemo {
    public static void main(String[] args) {

        // final void setDaemon(boolean on) 守护线程
        // 当其他的非守护线程执行完毕之后，守护线程会陆续结束
        // 应用场景：聊天过程中同时传输文件，关闭聊天界面后，传输文件也同时关闭（可设置为守护线程）
        MyThread01 t1 = new MyThread01();
        MyThread02 t2 = new MyThread02();

        t1.setName("香菱");
        t2.setName("钟离");

        //把第二个线程设置为守护线程
        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
