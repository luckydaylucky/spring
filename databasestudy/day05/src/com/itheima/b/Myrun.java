package com.itheima.b;

public class Myrun implements Runnable{
   @Override
    public void run(){
       for(int i = 0;i<100;i++){
           System.out.println("这是子线程"+Thread.currentThread().getName());
       }
   }
}
