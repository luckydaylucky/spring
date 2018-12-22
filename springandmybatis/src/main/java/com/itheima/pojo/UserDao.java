package com.itheima.pojo;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/12 23:57
 * @Version 1.0
 */
public interface UserDao {
    User queryUserById(int id);

    List<User> queryUserByUsername(String name);

    void saveuser(User user);
}
