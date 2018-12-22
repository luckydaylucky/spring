package com.com.itheima.jdbcpractice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcutilTest {
    public static void main(String[] args) throws SQLException {
        Connection con = JdbcUtil.getConnection();

        String sql = "delete from category where cid = 2";

        Statement st = con.createStatement();

        int count = st.executeUpdate(sql);

        System.out.println(count);
        JdbcUtil.closeAll(con,st,null);

    }
}
