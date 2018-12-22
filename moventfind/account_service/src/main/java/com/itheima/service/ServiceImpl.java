package com.itheima.service;

import com.itheima.utils.AccountDao;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/12/7 14:03
 * @Version 1.0
 */
public class ServiceImpl implements ServiceInter {
    @Override
    public void tranFer(String from, String to, double money) throws SQLException {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            AccountDao accountDao = new AccountDao();
            accountDao.in(connection,to,money);
            accountDao.out(connection,from,money);
            connection.commit();
        } catch (SQLException e) {
            if(connection!=null){
                connection.rollback();
            }
            e.printStackTrace();
        }finally {
            if (connection!=null){
                connection.close();
            }
        }

    }
}
