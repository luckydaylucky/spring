package com.itheima.domain;

public class user {
    public String name;
    private int age;

    public user() {
    }

    private user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void goWc(){
        System.out.println("我是私有的去厕所方法");
    }

    public void sleep(){
        System.out.println("我要睡觉了");
    }

    public void eat(String name,String food){
        System.out.println(name+"中午想吃"+food);
    }
}
