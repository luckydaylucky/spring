package com.com.itheima.jdbcpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteJdbc {
    public static void main(String[] args) throws SQLException {
//        建立连接
        Connection con = JdbcUtil.getConnection();

//        编写sql语句
        String sql = "delete from users where uid = ?";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1,2);
        int i = pst.executeUpdate();
        System.out.println(i);
        JdbcUtil.closeAll(con,pst,null);
    }
}
