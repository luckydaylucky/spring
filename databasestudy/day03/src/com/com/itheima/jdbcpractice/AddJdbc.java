package com.com.itheima.jdbcpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddJdbc {
    public static void main(String[] args) throws SQLException {
//        建立连接
        Connection con = JdbcUtil.getConnection();
//        编写sql语句
        String sql = "insert into users values(null,?,?)";
//        获取sql连接对象
        PreparedStatement st = con.prepareStatement(sql);
//        执行sql之前设置
        st.setString(1,"小李");
        st.setInt(2,123);
        int i = st.executeUpdate();
        System.out.println(i);
        JdbcUtil.closeAll(con,st,null);

    }
}
