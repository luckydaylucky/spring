package com.itheima.dao;

import com.itheima.domain.user;
import com.itheima.utils.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 19:40
 * @Version 1.0
 */
public class UserDaoImpl implements userDaoInterface {

    public  int findUserAll(String name) throws SQLException {
        DataSource dataSource = JDBCUtil.getDataSource();
        QueryRunner qr = new QueryRunner(dataSource);
        user user = qr.query("select * from users where username = ?", new BeanHandler<user>(user.class),name);
        return user == null? 0:1;


    }

//    public static void main(String[] args) throws SQLException {
//        int count = findUserAll1("张三");
//        System.out.println(count);
//    }


//    @Override
//    public int findUserAll(String name) throws SQLException {
//        return 0;
//    }
}
