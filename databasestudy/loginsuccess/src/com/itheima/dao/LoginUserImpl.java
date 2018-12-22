package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUTILS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 15:38
 */
public class LoginUserImpl implements loginDao {
    @Override
    public boolean loginUser(User user) throws SQLException, ClassNotFoundException {
        Connection con = JDBCUTILS.getconnection();

        String sql = "select *from users where username = ? and password = ?";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,user.getUsername());
        pst.setString(2,user.getPassword());

        ResultSet rs = pst.executeQuery();

        if (rs.next()){
            JDBCUTILS.CloseAll(con,pst,rs);
            return true;
        }else {
            JDBCUTILS.CloseAll(con,pst,rs);
            return false;
        }


    }
}
