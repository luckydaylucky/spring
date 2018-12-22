package com.itheima.Dao;

import com.itheima.JCBDUtils.JDBCUtils;
import com.itheima.a.Test;
import com.itheima.domain.Contact;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class ContactDaoImpl implements ContactDao {
    @Override
    public List<Contact> findAllContact() throws SQLException {
        DataSource dataSource = JDBCUtils.getGetdatasource();
        QueryRunner qr = new QueryRunner(dataSource);
        String sql = "select *from contact";
        List<Contact> lsit = qr.query(sql,new BeanListHandler<Contact>(Contact.class));
        return lsit;
    }


}
