package com.itheima.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: MR.z
 * @Date: 2018/11/26 7:53
 * @Version 1.0
 */
public class JDBCUtils {
    private static DataSource dataSource = new ComboPooledDataSource();
    public static DataSource getDataSource(){
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();

    }

    public static void closeAll(Connection con , Statement st , ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(con != null){
            try {
                con.close();  //归还到连接池
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

