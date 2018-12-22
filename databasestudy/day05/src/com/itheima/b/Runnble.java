package com.itheima.b;

public class Runnble {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<100;i++){
                    System.out.println("这是子方法");
                }
            }
        });
        t.start();

        for(int i = 0;i<100;i++){
            System.out.println("主方法"+i);
        }

    }
}
