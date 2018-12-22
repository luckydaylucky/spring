package com.itheima.service;

import com.itheima.domain.User;

import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 13:41
 */
public interface ServiceInter {
    public boolean loginService(User user) throws SQLException, ClassNotFoundException;
}
