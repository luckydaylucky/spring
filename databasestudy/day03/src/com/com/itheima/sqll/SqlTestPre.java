package com.com.itheima.sqll;

import java.sql.*;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class SqlTestPre {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();

        System.out.println("请输入密码");
        String password = sc.nextLine();
        Connection con = JdbcUtil.getConnection();
        String sql = "select *from users where username = ? and password = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,username);
        pst.setString(2,password);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名或密码错误");
        }
        JdbcUtil.closeAll(con,pst,rs);
    }
}
