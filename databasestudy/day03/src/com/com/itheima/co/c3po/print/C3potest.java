package com.com.itheima.co.c3po.print;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C3potest {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new ComboPooledDataSource();
        Connection con = dataSource.getConnection();
        String sql = "insert into users values(null,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,"刘翔");
        pst.setInt(2,45621);
        int i = pst.executeUpdate();
        System.out.println(i);
        pst.close();
        con.close();
    }



}
