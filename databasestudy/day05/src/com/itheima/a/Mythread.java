package com.itheima.a;

public class Mythread extends Thread {
    public Mythread(String name) {
    }

    @Override
    public void run(){
        for(int i = 0;i<=100;i++){
            System.out.println(getName()+"我是子线程"+i);
        }

    }
}
