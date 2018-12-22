package com.itheima.test;

public class peron {

    private String name;

    public peron() {
        System.out.println("这是无参构造");
    }

    public peron(String name) {
        this.name = name;
    }

    public void peronEat(){
        System.out.println("开饭了");
    }


}
