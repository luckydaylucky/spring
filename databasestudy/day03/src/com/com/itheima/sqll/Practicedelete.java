package com.com.itheima.sqll;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Practicedelete {
    public static void main(String[] args) throws SQLException {
//        建立连接
        Connection con = JdbcUtil.getConnection();
//        编写sql语句
        String sql = "delete from category where cid=1";
//        获取执行对象
        Statement st = con.createStatement();
//        执行sql语句
        int conut = st.executeUpdate(sql);

        System.out.println(conut);
        JdbcUtil.closeAll(con,st,null);

    }
}
