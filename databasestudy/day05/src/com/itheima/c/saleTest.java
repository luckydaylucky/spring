package com.itheima.c;

public class saleTest {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.setName("01窗口");
        Ticket t2 = new Ticket();
        t2.setName("02窗口");
        Ticket t3 = new Ticket();
        t3.setName("03窗口");
        t1.start();
        t2.start();
        t3.start();

    }
}
