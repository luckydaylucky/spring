package com.com.itheima.sqll;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticeUpdate {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
//编写sql语句
        String sql = "update category set cname = '小白' where cid = 2";
//        调用对象
        Statement st = connection.createStatement();
//        执行sql语句
        int count = st.executeUpdate(sql);
        System.out.println(count);

        JdbcUtil.closeAll(connection,st,null);

    }
}
