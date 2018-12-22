package com.itheima.service;

import com.itheima.domain.Users;

import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 11:00
 */
public interface userService {
    public boolean loginService(Users users) throws SQLException, ClassNotFoundException;
}
