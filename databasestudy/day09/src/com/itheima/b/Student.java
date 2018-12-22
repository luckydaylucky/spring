package com.itheima.b;

public class Student extends Person {

    @Override
    public void sleep() {
        System.out.println("学生睡觉了");

    }

    @Override
    public void eat() {
        System.out.println("学生吃饭了");

    }
}
