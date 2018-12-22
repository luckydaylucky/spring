package com.itheima.utils;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @Author: MR.z
 * @Date: 2018/12/7 13:48
 * @Version 1.0
 */
public class AccountDaoTest {

    @Test
    public void out() throws SQLException {
        AccountDao accountDao = new AccountDao();
        accountDao.out(JDBCUtils.getConnection(),"aaa",200);
    }

    @Test
    public void in() throws SQLException {
        AccountDao accountDao = new AccountDao();
        accountDao.in(JDBCUtils.getConnection(),"bbb",200);
    }
}