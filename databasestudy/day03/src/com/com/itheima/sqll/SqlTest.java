package com.com.itheima.sqll;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlTest {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();

        System.out.println("请输入密码");
        String password = sc.nextLine();

        Connection con = JdbcUtil.getConnection();
        String sql = "select *from users where username = '"+username+"'and password='"+password+"'";

        System.out.println(sql);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if(rs.next()){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名或密码错误");
        }
        JdbcUtil.closeAll(con,st,rs);
    }
}
