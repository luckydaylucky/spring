package com.itheima.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/12/2 18:03
 * @Version 1.0
 */
public class JDBCUTIls {
    public static DataSource dataSource = new ComboPooledDataSource();

    public static DataSource getDataSource(){
        return dataSource;
    }

    public static Connection connection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void CloseAll(Connection con, PreparedStatement pst, ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
