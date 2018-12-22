package com.itheima.a;

public class demo3 {
    public static void main(String[] args) {
        Myrun run = new Myrun();
        Thread t = new Thread(run);
        t.start();
        for (int i = 0; i <300 ; i++) {
            System.out.println("主线程"+Thread.currentThread().getName()+run);
        }

    }
}
