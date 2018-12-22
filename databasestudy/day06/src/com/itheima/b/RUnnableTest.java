package com.itheima.b;

import org.junit.jupiter.api.Test;

public class RUnnableTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("这是主线程"+i);
        }
    }

}
