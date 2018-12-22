package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/8 9:35
 * @Version 1.0
 */
public interface UserMapper {
    User querryone(int id);

    List<User> querryByname(String name);

    void saveUser(User user);

}
