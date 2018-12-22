package com.itheima.a;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JButis {
    private static DataSource dataSource = new ComboPooledDataSource();

    public static DataSource getdatasoce(){
        return dataSource;
    }

    public static Connection getconnection() throws SQLException {
        return dataSource.getConnection();
    }
}
