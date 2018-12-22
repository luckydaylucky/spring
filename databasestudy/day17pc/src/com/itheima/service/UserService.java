package com.itheima.service;

import com.itheima.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/1 21:32
 * @Version 1.0
 */
public interface UserService {
    public List<User> userService(String name) throws SQLException;
}
