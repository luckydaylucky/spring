package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUTIls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 13:33
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean loginUser(User user) throws SQLException, ClassNotFoundException {
        Connection con = JDBCUTIls.getConnection();

        String sql = "select *from users where username = ? and password = ?";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,user.getUsername());
        pst.setString(2,user.getPassword());

        ResultSet rs = pst.executeQuery();

        if(rs.next()){
            return true;
        }else {
            return false;
        }


    }
}
