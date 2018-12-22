package com.itheima.service;

import com.itheima.dao.UserImpl;
import com.itheima.dao.userInter;
import com.itheima.domain.user;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 21:35
 * @Version 1.0
 */
public class ServiceImpl implements ServiceInter {
    @Override
    public List<user> ServiceUser(String name) throws SQLException {
        userInter user = new UserImpl();

        return user.findAll(name);
    }
}
