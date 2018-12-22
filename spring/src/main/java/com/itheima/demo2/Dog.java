package com.itheima.demo2;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 9:34
 * @Version 1.0
 */
public class Dog {
    private String dogname;
    private String color;
    private int sex;

    public Dog() {
    }

    public Dog(String dogname, String color, int sex) {
        this.dogname = dogname;
        this.color = color;
        this.sex = sex;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogname='" + dogname + '\'' +
                ", color='" + color + '\'' +
                ", sex=" + sex +
                '}';
    }
}
