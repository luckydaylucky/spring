package com.itheima.dao;

import com.itheima.domain.User;

import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 15:36
 */
public interface loginDao {
    public boolean loginUser(User user) throws SQLException, ClassNotFoundException;

}
