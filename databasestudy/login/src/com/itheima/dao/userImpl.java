package com.itheima.dao;


import com.itheima.domain.Users;
import com.itheima.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 10:35
 */
public class userImpl implements daoInterface {


    @Override
    public boolean useerr(Users user) throws SQLException, ClassNotFoundException {
        Connection con = JDBCUtils.getConnection();

        String sql = "select *from users where username=? and password=?";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,user.getUsername());
        pst.setString(2,user.getPassword());

        ResultSet rs = pst.executeQuery();

        if(rs.next()){
            JDBCUtils.CloseAll(con,pst,rs);
            return true;
        }else {
            JDBCUtils.CloseAll(con,pst,rs);
            return false;
        }
    }
}
