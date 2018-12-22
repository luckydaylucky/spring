package com.itheima.b;

public class RunnaTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("这是主线程"+i);
        }
    }
}
