package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(User user) throws SQLException, ClassNotFoundException {
        Connection con = JDBCUtils.getConnection();
        String sql = "Select *from users where username = ? and password = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, user.getUsername());
        pst.setString(2, user.getPassword());

        ResultSet rs = pst.executeQuery();

        if(rs.next()) {
            JDBCUtils.closeAll(con,pst,rs);
            return true;
        }else {
            JDBCUtils.closeAll(con,pst,rs);
            return false;
        }
    }


}
