package com.itheima.dao;

/**
 * @Author: MR.z
 * @Date: 2018/12/9 19:55
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void hello() {
        System.out.println("hello spring");
    }

}
