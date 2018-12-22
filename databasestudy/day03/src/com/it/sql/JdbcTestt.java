package com.it.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestt {
    public static void main(String[] args) throws SQLException {
//        注册工具类
        Connection connection = JdbcUtil.getConnection();
//        编写sql语句
        String sql = "insert into category values(null,'食品')";
        Statement st = connection.createStatement();
        int count = st.executeUpdate(sql);
        System.out.println(count);
        JdbcUtil.closeAll(connection,st,null);
    }
}
