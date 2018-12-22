package com.itheima.dao;

import com.itheima.domain.User;

import java.sql.SQLException;

public interface UserDao {
    public boolean loginDao(User user) throws SQLException, ClassNotFoundException;
}
