package com.itheima.c;




public class SeleTicket {
    public static void main(String[] args) {
        Tickets t1 = new Tickets();
        t1.setName("窗口1");
        Tickets t2 = new Tickets();
        t2.setName("窗口2");
        Tickets t3 = new Tickets();
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
