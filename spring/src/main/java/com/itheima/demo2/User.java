package com.itheima.demo2;

import java.util.Date;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 9:14
 * @Version 1.0
 */
public class User {
    private String username;
    private int sex;
    private int age;
    private Date birthday;

    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public User() {
    }

    public User(String username, int sex, int age, Date birthday) {
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
