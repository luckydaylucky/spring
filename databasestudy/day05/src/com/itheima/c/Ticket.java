package com.itheima.c;

public class Ticket extends Thread {
    static int ticket = 1;

    @Override
    public void run(){
        while (true){
            synchronized (Ticket.class) {

                if (ticket <= 0) {
                    break;
                }
                System.out.println(ticket);
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }

            ticket--;

            System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"票");
        }
    }
}
