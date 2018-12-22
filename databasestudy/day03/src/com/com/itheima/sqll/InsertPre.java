package com.com.itheima.sqll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPre {
    public static void main(String[] args) throws SQLException {
        Connection con = JdbcUtil.getConnection();
        String sql = "insert into users values(null,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,"小白");
        pst.setInt(2,2);
        int i = pst.executeUpdate();
        System.out.println(i);
        JdbcUtil.closeAll(con,pst,null);
    }
}
