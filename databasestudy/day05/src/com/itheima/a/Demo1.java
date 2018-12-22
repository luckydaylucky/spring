package com.itheima.a;

public class Demo1 {
    public static void main(String[] args) {
        Mythread mr = new Mythread("新的线程");
        mr.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("这是主线程"+i);

        }
    }
}
