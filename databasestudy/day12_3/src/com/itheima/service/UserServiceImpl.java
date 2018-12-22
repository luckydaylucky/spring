package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.dao.UserDaoImpl;
import com.itheima.domain.User;

import java.sql.SQLException;

public class UserServiceImpl implements UserService{
    @Override
    public boolean loginService(User user) throws SQLException, ClassNotFoundException {
        UserDao dao = new UserDaoImpl();
        boolean flag = dao.loginDao(user);
        return flag;
    }
}
