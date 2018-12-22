package com.itheima.a;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MoneyTest {
    @Test
    public void moeytest() throws ClassNotFoundException, SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///day04","root","root");
            con.setAutoCommit(false);

            String sql = "update account set money = money + ? where name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDouble(1,-1000);
            pst.setString(2,"jack");
            int i = pst.executeUpdate();
            System.out.println("Jack减钱"+i);



            pst.setDouble(1,+1000);
            pst.setString(2,"rose");
            int i1 = pst.executeUpdate();
            System.out.println("rose加钱"+i1);

            con.commit();
            System.out.println("转账成功");
            pst.close();
            con.close();
        } catch (Exception e) {
            con.rollback();
            e.printStackTrace();
        }



    }
}
