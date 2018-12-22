package com.itheima.demo6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 11:36
 * @Version 1.0
 */
@Component("dog")
public class Dog {
    @Value("斗牛犬")
    private String name;
    @Value("5")
    private int age;
    @Value("2")
    private int sex;

    public Dog() {
    }

    public Dog(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
