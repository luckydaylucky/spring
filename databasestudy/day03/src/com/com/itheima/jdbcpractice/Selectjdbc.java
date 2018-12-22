package com.com.itheima.jdbcpractice;

import java.sql.*;
import java.util.Scanner;

public class Selectjdbc {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

//        获取连接
        Connection con = JdbcUtil.getConnection();
//        编写sql语句
        String sql = "select *from users where username = ? and password = ?";

//        执行sql语句
        PreparedStatement pst = con.prepareStatement(sql);
//        执行sql语句前设置
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
