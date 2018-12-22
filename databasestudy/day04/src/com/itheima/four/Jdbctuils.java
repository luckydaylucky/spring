package com.itheima.four;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class Jdbctuils {
    private static DataSource dataSource = new ComboPooledDataSource();

    public static DataSource getDataSource(){
        return dataSource;
    }

    public static Connection connection() throws SQLException {
        Connection con  = dataSource.getConnection();
        return con;
    }

}
