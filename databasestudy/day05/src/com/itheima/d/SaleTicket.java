package com.itheima.d;

public class SaleTicket {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t,"1窗口");
        Thread t2 = new Thread(t,"2窗口");
        Thread t3 = new Thread(t,"3窗口");

        t1.start();
        t2.start();
        t3.start();
    }


}
