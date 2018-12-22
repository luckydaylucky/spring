package com.itheima.b;

public class Demo {
    public static void main(String[] args) {
        MYThread mt = new MYThread();
        mt.start();
        for (int i = 0; i < 100 ; i++) {
            System.out.println("我是主线程");
        }
    }
}
