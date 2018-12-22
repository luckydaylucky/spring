package com.itheima.service;

import com.itheima.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/6 11:15
 * @Version 1.0
 */
public interface serviceUser {
    public List<User> servicUser() throws SQLException;
}
