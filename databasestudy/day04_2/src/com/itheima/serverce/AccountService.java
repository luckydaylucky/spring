package com.itheima.serverce;

import com.itheima.dao.Accountdao;
import com.itheima.util.JDBCUtil;
import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountService {
    public int transfer(String from,String to,Double money) throws SQLException {
        Connection con = null;
        int flag = 0;
        try {

            con = JDBCUtil.getConnection();
            con.setAutoCommit(false);
            Accountdao dao = new Accountdao();
            int n = dao.removeMoney(con,from,money);
            int m = dao.addMoney(con,to,money);
            DbUtils.commitAndClose(con);

            if(n ==1 && m == 1){
               flag = 1;
            }else {
                flag =0;
            }


        } catch (SQLException e) {
            DbUtils.rollbackAndCloseQuietly(con);
            e.printStackTrace();
        }
        return flag;
    }

}
