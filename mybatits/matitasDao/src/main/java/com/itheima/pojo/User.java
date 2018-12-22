package com.itheima.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @Author: MR.z
 * @Date: 2018/12/8 9:37
 * @Version 1.0
 */
public class User {
    private int id;
    private String username;
    private Date birthday;
    private String sex;
    private String adress;

    public User() {
    }

    public User(int id, String username, Date birthday, String sex, String adress) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
