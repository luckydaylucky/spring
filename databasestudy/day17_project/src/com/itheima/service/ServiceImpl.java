package com.itheima.service;

import com.itheima.dao.UserDaoImpl;

import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 19:52
 * @Version 1.0
 */
public class ServiceImpl implements serviceInter {
    @Override
    public int ServiceFind(String name) throws SQLException {
        UserDaoImpl userDao = new UserDaoImpl();
        return userDao.findUserAll(name);
    }
}
