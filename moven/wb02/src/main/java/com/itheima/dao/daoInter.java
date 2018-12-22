package com.itheima.dao;

import com.itheima.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/6 10:54
 * @Version 1.0
 */
public interface daoInter {
    public List<User> daouser() throws SQLException;
}
