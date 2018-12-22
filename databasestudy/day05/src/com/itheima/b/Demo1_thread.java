package com.itheima.b;

public class Demo1_thread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println("这是子线程"+i);
                }

            }
        }.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("这是主线程"+i);
        }

    }
}
