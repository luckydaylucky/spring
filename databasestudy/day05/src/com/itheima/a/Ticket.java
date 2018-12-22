package com.itheima.a;

public class Ticket implements Runnable {
    private int ticket = 100;
    Object lock = new Object();


    @Override
    public void run() {
        while (true){
            synchronized (lock) {
                if (ticket > 0) {
                    System.out.println("有票卖");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + ticket--);
                }
            }
        }
    }
}
