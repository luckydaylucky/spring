package com.it.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcTest {
    public static void main(String[] args) throws SQLException {
//        创建连接
        Connection con = JdbcUtil.getConnection();
//写sql语句
        String sql = "update users set username = ？where uid = ? ";
//      创建预编译语句执行对象
        PreparedStatement preparedStatement = con.prepareStatement(sql);
//        设置？号中的对象
        preparedStatement.setString(1, "小白");
        preparedStatement.setInt(2, 2);

//      执行sql语句
        int i = preparedStatement.executeUpdate();
        System.out.println(i);

//        关闭资源
        JdbcUtil.closeAll(con,preparedStatement,null);

    }
}
