package com.itheima.dao;



import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class Accountdao {
    public int removeMoney(Connection con,String from,Double money) throws SQLException {
        QueryRunner qr = new QueryRunner();
        int count = qr.update(con,"update account set money = money - ? where name = ?",money,from);
        return count;
    }

    public int addMoney(Connection con,String to,Double money) throws SQLException {
        QueryRunner qr = new QueryRunner();
        int count = qr.update(con,"update account set money = money + ? where name = ?",money,to);
        return count;
    }

}
