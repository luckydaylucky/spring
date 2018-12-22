package com.com.itheima.jdbcpractice;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateJdbc {
    public static void main(String[] args) throws SQLException {
//        建立连接
        Connection con = JdbcUtil.getConnection();
//        编写sql语句
        String sql = "update users set Password = ? where uid = ?";
//        创建预编译执行对象
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,66666);
        pst.setInt(2,5);
        int i = pst.executeUpdate();
        System.out.println(i);
        JdbcUtil.closeAll(con,pst,null);


//
    }
}
