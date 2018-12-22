package com.itheima.dao;

import com.itheima.domain.user;
import com.itheima.utils.JDBCUTils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 21:18
 * @Version 1.0
 */
public class UserImpl implements userInter {
    @Override
    public List<user> findAll(String name) throws SQLException {
        DataSource dataSource = JDBCUTils.getDataSource();

        QueryRunner qr = new QueryRunner(dataSource);
        List<user> users = qr.query("select * from user where name like  ? limit 5 ", new BeanListHandler<user>(user.class), "%" + name + "%");
        return users;

    }

    @Test
    public void test() throws SQLException {
        List<user> name = findAll("张");
        System.out.println(name);
    }
}
