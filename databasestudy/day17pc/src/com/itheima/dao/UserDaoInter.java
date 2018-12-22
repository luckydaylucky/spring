package com.itheima.dao;

import com.itheima.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/1 21:18
 * @Version 1.0
 */
public interface UserDaoInter {
    public List<User> findUser(String name) throws SQLException;
}
