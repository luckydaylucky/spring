package com.itheima.mapper;

import com.itheima.pojo.QueryVo;
import com.itheima.pojo.User;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/8 20:15
 * @Version 1.0
 */
public interface UserMapper {
    User querryone(int id);

    List<User> querryByname(String name);

    void saveUser(User user);

    List<User> querryByUser(QueryVo queryVo);

    int queryCount();

    List<User> queryUserSex(User user);

    List<User> queryByIds(QueryVo queryVo);
}
