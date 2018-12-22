package com.itheima.service;

import com.itheima.domain.User;

import java.sql.SQLException;

public interface UserService {

    public boolean loginService(User user) throws SQLException, ClassNotFoundException;
}
