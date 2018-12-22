package com.itheima.service;

import com.itheima.dao.DaoUserImpl;
import com.itheima.dao.daoInter;
import com.itheima.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/6 11:16
 * @Version 1.0
 */
public class serviceImpl implements serviceUser {
    @Override
    public List<User> servicUser() throws SQLException {
        daoInter daoInter = new DaoUserImpl();
        List<User> querry = daoInter.daouser();
        return querry;
    }
}
