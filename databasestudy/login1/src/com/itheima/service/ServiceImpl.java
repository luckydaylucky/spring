package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.dao.UserDaoImpl;
import com.itheima.domain.User;

import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 13:45
 */
public class ServiceImpl implements ServiceInter {

    @Override
    public boolean loginService(User user) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDaoImpl();

        boolean flag = userDao.loginUser(user);
        return flag;
    }
}
