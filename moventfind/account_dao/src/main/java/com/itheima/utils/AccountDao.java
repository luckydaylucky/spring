package com.itheima.utils;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/12/7 13:40
 * @Version 1.0
 */
public class AccountDao {
    public void out(Connection con,String outAccount,double money) throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "update account set money = money - ? where name = ?";
        qr.update(con,sql,money,outAccount);
    }

    public void in(Connection con,String inAccount,double money) throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "update account set money = money + ? where name = ?";
        qr.update(con,sql,money,inAccount);
    }
}
