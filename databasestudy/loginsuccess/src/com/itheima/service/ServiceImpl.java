package com.itheima.service;

import com.itheima.dao.LoginUserImpl;
import com.itheima.dao.loginDao;
import com.itheima.domain.User;

import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 15:47
 */
public class ServiceImpl implements ServiceInte {


    @Override
    public boolean loginService(User user) throws SQLException, ClassNotFoundException {
        loginDao loo = new LoginUserImpl();
        boolean flag = loo.loginUser(user);
        return flag;
    }
}
