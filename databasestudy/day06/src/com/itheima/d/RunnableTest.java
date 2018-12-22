package com.itheima.d;

import com.itheima.c.Tickets;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable r = new Runnable();
        Thread t1 = new Thread(r,"01窗口");
        Thread t2 = new Thread(r,"02窗口");
        Thread t3 = new Thread(r,"03窗口");

        t1.start();
        t2.start();
        t3.start();


    }
}
