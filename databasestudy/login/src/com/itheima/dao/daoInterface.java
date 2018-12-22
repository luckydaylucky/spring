package com.itheima.dao;

import com.itheima.domain.Users;

import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 10:40
 */
public interface daoInterface {
    public boolean useerr(Users user) throws SQLException, ClassNotFoundException;
}
