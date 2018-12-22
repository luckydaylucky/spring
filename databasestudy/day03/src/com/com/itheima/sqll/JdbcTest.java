package com.com.itheima.sqll;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();

        String sql = "insert into category values (3,'食品')";
    }
}
