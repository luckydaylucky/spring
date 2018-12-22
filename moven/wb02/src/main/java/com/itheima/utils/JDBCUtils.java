package com.itheima.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/12/6 10:58
 * @Version 1.0
 */
public class JDBCUtils {
    private static DataSource dataSource = new ComboPooledDataSource();

    public static DataSource getDataSource(){
        return dataSource;
    }

    public static Connection getconnection() throws SQLException {
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
