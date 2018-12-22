package com.itheima.service;

import com.itheima.dao.UserDaoImpl;
import com.itheima.dao.UserDaoInter;
import com.itheima.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/1 21:33
 * @Version 1.0
 */
public class UserSerImpl implements UserService {
    @Override
    public List<User> userService(String name) throws SQLException {
        UserDaoInter userDao = new UserDaoImpl();
        return userDao.findUser(name);
    }
}
