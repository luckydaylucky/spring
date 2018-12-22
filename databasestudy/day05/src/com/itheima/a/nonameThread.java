package com.itheima.a;

public class nonameThread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100 ; i++) {
                    System.out.println("这是子线程"+i);
                }
            }
        };
        new Thread(r).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("这是主线程"+i);
        }
    }

}
