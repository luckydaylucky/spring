package com.itheima.b;

public class Demo1 {
    public static void main(String[] args) {
        Myrun mr = new Myrun();
        Thread t = new Thread(mr);
        t.start();
        for(int i = 0;i<100;i++){
            System.out.println("这是主线程"+Thread.currentThread().getName());
        }
    }
}
