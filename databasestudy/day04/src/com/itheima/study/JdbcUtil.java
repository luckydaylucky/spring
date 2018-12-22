package com.itheima.study;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtil {
    private static DataSource dataSource = new ComboPooledDataSource();

    public static DataSource getDataSource(){
        return dataSource;
    }

   public static Connection getconnection() throws SQLException {
        return dataSource.getConnection();
   }
}
