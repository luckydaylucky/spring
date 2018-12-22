package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/12 23:57
 * @Version 1.0
 */
public interface UserMapper {
    User queryUserById(int id);

    List<User> queryUserByUsername(String name);

    void saveUser(User user);
}
