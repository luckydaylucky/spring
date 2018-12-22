package com.itheima.b;

public class user extends Person {
    @Override
  public void sleep() {
        System.out.println("用户在吃饭");

    }

    @Override
    public void eat() {
        System.out.println("用户在睡觉");
    }
}
