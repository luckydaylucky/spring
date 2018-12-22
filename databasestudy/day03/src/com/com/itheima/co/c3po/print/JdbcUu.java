package com.com.itheima.co.c3po.print;



import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.activation.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUu {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    public static Connection connection() throws SQLException {
       Connection con = dataSource.getConnection();
       return con;
    }



   public void CloseAll(Connection con, Statement st,ResultSet rs){
       if(rs!=null){
           try {
               rs.close();
           }catch (SQLException e){
               e.printStackTrace();
           }

       }
       if(st!=null){
           try {
               rs.close();
           }catch (SQLException e){
               e.printStackTrace();
           }

       }
       if(con!=null){
           try {
               rs.close();
           }catch (SQLException e){
               e.printStackTrace();
           }

       }
   }



}
