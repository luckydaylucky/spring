package com.itheima.dao;

import com.itheima.domain.Conect;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/26 13:42
 * @Version 1.0
 */
public class ContactDaoImpl implements ContactDao {
    @Override
    public List<Conect> findAll() throws SQLException {
        DataSource dataSource = JDBCUtils.getDataSource();
        QueryRunner qr = new QueryRunner(dataSource);
        List<Conect> list = qr.query("select * from contact",new BeanListHandler<Conect>(Conect.class));
        return list;
    }
}
