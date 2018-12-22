package com.itheima.d;

public class Runnable implements java.lang.Runnable {
    int ticket = 100;
    @Override
    public void run() {
        while (true){
            if(ticket<=0){
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在卖"+ticket--+"票");
        }

    }
}
