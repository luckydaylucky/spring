package com.com.itheima.sqll;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticeId {
    public static void main(String[] args) throws SQLException {
//        建立连接
        Connection con = JdbcUtil.getConnection();
//        编写sql语句
        String sql = "select *from category where cid = 2";
//        获取语句执行对象
        Statement st = con.createStatement();
//         执行sql语句
        ResultSet rs = st.executeQuery(sql);

        if(rs.next()){
            Integer cid = rs.getInt("cid");
            String cname = rs.getString("cname");
            System.out.println("cid"+cid+" ,cname"+cname);
        }

    }
}
