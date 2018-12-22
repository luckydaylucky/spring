package com.itheima.dao;

import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 19:39
 * @Version 1.0
 */
public interface userDaoInterface {
    public int findUserAll(String name) throws SQLException;
}
