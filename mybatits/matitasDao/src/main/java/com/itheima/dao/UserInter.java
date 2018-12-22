package com.itheima.dao;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/8 9:35
 * @Version 1.0
 */
public interface UserInter {
    User querrybyid(int id);

    List<User> querryUser(String name);

    void saveUser(User user);

}
