package com.com.itheima.co.c3po.print;

import com.com.itheima.sqll.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class c3p00 {
    public static void main(String[] args) throws SQLException {
        Connection con = JdbcUtil.getConnection();
        String sql = "insert into users values(null,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,"老哥");
        pst.setInt(2,786441);
        int i = pst.executeUpdate();
        System.out.println(i);
        JdbcUtil.closeAll(con,pst,null);

    }
}
