package com.com.itheima.c30;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C3p0Demo {
    public static void main(String[] args) throws SQLException {
       DataSource dataSource = new ComboPooledDataSource();
       Connection con = dataSource.getConnection();
       String sql = "insert into users values(null,?,?)";
       PreparedStatement pst = con.prepareStatement(sql);
       pst.setString(1,"王");
       pst.setString(2,"66");
       int i = pst.executeUpdate();
       System.out.println(i);
       pst.close();
       con.close();



    }
}
