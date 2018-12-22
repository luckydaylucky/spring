package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/6 10:58
 * @Version 1.0
 */
public class DaoUserImpl implements daoInter {
    public List<User> daouser() throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select *from user name";
        List<User> users = qr.query(sql, new BeanListHandler<User>(User.class));
        return users;
    }
}
