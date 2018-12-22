package com.itheima.service;

import com.itheima.dao.daoInterface;
import com.itheima.dao.userImpl;
import com.itheima.domain.Users;

import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 11:11
 */
public class UsersImpl implements userService {
    @Override
    public boolean loginService(Users users) throws SQLException, ClassNotFoundException {
        daoInterface dao = new userImpl();

        boolean flag = dao.useerr(users);
        return flag;
    }
}
