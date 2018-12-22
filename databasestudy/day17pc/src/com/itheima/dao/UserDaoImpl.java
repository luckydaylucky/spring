package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.utils.UTILS;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/1 21:20
 * @Version 1.0
 */
public class UserDaoImpl implements UserDaoInter {
    @Override
    public List<User> findUser(String name) throws SQLException {
        DataSource getdatabase = UTILS.getdatabase();
        QueryRunner qr = new QueryRunner(getdatabase);
        List<User>list = qr.query("select * from user where name like ? limit 5", new BeanListHandler<User>(User.class),"%"+name+"%");
        return list;
    }

    @Test
    public void test() throws SQLException {
        List<User> user = findUser("张");
        System.out.println(user);
    }
}
