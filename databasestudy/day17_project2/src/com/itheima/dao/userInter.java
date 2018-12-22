package com.itheima.dao;

import com.itheima.domain.user;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 21:14
 * @Version 1.0
 */
public interface userInter {
    public List<user> findAll(String name) throws SQLException;

}
