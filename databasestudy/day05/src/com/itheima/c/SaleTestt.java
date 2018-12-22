package com.itheima.c;

import com.itheima.a.Mythread;

public class SaleTestt {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.setName("1窗口");
        Ticket t2 = new Ticket();
        t2.setName("2窗口");
        Ticket t3 = new Ticket();
        t3.setName("3窗口");
        t1.start();
        t2.start();
        t3.start();

    }

}
